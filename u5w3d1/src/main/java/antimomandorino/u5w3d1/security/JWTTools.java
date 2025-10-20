package antimomandorino.u5w3d1.security;


import antimomandorino.u5w3d1.entities.Dipendente;
import io.jsonwebtoken.Jwts;
import org.springframework.stereotype.Component;

@Component
public class JWTTools {

    public String createToken8(Dipendente dipendente) {

        return Jwts.builder()
                .issuedAt()
                .expiration()
                .subject()

    }
}
