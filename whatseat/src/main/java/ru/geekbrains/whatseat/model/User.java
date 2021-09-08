package ru.geekbrains.whatseat.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.validation.constraints.NotEmpty;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class User implements UserDetails {
	 public static final PasswordEncoder PASSWORD_ENCODER =
	            new BCryptPasswordEncoder();
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	 
	    @NotNull
	    @NotEmpty
	    private String name;

	    @Column(unique = true)
	    @Size(min = 2, max = 20,
	            message = "имя пользователя должно содержать не менее 2 символа и не больше 20 символов")
	    private String username;

	   
	    @JsonIgnore
	    @NotNull
	    @NotEmpty
	    private String password;

	    
	    @Column(nullable = false)
	    private boolean enabled;

	  
	    @OneToOne
	    @JoinColumn(name = "role_id")
	    private Role role;

	    // favorite recipes
	    @ManyToMany(mappedBy = "favoriteUsers")
	    private List<Recipe> favoriteRecipes = new ArrayList<>();

	    @OneToMany(mappedBy = "owner")
	    private List<Recipe> ownedRecipes = new ArrayList<>();

	    

	    public Long getId() {
	        return id;
	    }

	    public void setId(Long id) {
	        this.id = id;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public void setUsername(String username) {
	        this.username = username;
	    }

	    public void setPassword(String password) {
	        this.password = PASSWORD_ENCODER.encode(password);
	    }

	    public void setEnabled(boolean enabled) {
	        this.enabled = enabled;
	    }

	    public Role getRole() {
	        return role;
	    }

	    public void setRole(Role role) {
	        this.role = role;
	    }

	    public List<Recipe> getFavoriteRecipes() {
	        return favoriteRecipes;
	    }

	    public void setFavoriteRecipes(List<Recipe> favoriteRecipes) {
	        this.favoriteRecipes = favoriteRecipes;
	    }

	    public List<Recipe> getOwnedRecipes() {
	        return ownedRecipes;
	    }

	    public void setOwnedRecipes(List<Recipe> ownedRecipes) {
	        this.ownedRecipes = ownedRecipes;
	    }

		@Override
		public Collection<? extends GrantedAuthority> getAuthorities() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public String getPassword() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public String getUsername() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public boolean isAccountNonExpired() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean isAccountNonLocked() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean isCredentialsNonExpired() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean isEnabled() {
			// TODO Auto-generated method stub
			return false;
		}
}
