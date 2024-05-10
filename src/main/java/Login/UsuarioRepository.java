/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Login;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author alvarogasca
 */
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Usuario findByUsername (String username);
}
