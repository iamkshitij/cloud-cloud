import org.springframework.data.jpa.repository.JpaRepository;

public interface TransferDetailsRepository extends JpaRepository<TransferDetailsEntity, Long> {
    // Add any custom queries if needed
}
