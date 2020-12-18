package guru.springframework.repositories.reactive;

import guru.springframework.domain.UnitOfMeasure;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Mono;

public interface UnitOfMeasureReactiveRepository extends ReactiveCrudRepository<UnitOfMeasure,String> {

    Mono<UnitOfMeasure> findByDescription(String description);
}
