package cit59x.hackathon.mental_placeblog.repo;

import cit59x.hackathon.mental_placeblog.entity.Quote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuoteRepository extends JpaRepository<Quote, Integer> {
}
