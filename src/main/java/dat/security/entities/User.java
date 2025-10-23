package dat.security.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "users")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    
    @Column(nullable = false, unique = true)
    private String username;
    
    @Column(nullable = false)
    private String hashedPassword;
    
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private T3N3T.Enum.Role role;
    
    // Fields merged from dat.config.entities.User
    @Column(nullable = false)
    private String email;
    
    @Column
    private String firstName;
    
    @Column
    private String lastName;
    
    @Column
    private boolean active = true;
    
    public User(String username, String hashedPassword, T3N3T.Enum.Role role) {
        this.username = username;
        this.hashedPassword = hashedPassword;
        this.role = role;
        this.active = true;
    }
    
    public User(String username, String email) {
        this.username = username;
        this.email = email;
        this.active = true;
    }
}
