package cit59x.hackathon.mental_placeblog.service;

import cit59x.hackathon.mental_placeblog.entity.Quote;
import cit59x.hackathon.mental_placeblog.repo.QuoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TaskSevice {

//    private static EntityManagerFactory factory;
//    private static EntityManager manager;
//    private static EntityTransaction transaction;
//    private static Session session;

    private final QuoteRepository quoteRepository;

    @Autowired
    public TaskSevice(QuoteRepository quoteRepository) {
        this.quoteRepository = quoteRepository;
    }

    /**
     * Get 4 quotes from database and return.
     *
     * @return a list of 4 quotes
     */
    public List<Quote> getQuotes() {
//        factory = Persistence.createEntityManagerFactory("default");
//        manager = factory.createEntityManager();
//        session = manager.unwrap(Session.class);
//        transaction = manager.getTransaction();
        //get a random quote from db
        int totalSetCount = (int) quoteRepository.count() / 4;
        int id = (int) ((Math.random() * (totalSetCount - 1)) + 1);
        List<Quote> res = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            res.add(quoteRepository.findById(id + i).get());
        }
//        session.close();
//        manager.close();
//        factory.close();
        return res;
    }

//    /**
//     * Get quote by ID from database and return.
//     *
//     * @return quote content
//     */
//    public String getQuoteByID(int id) {
//        TypedQuery<Quote> getQuoteByIdQuery = manager.createNamedQuery("Quote.byID", Quote.class);
//        getQuoteByIdQuery.setParameter(1, id);
//        List<Quote> results = getQuoteByIdQuery.getResultList();
//        return results.get(0).getContent();
//    }
}
