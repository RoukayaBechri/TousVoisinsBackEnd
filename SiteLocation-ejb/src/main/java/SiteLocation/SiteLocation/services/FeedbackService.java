package SiteLocation.SiteLocation.services;

import java.util.Date;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.ws.rs.Path;

import SiteLocation.SiteLocation.persistence.Feedback;
import SiteLocation.SiteLocation.persistence.FeedbackPk;
import SiteLocation.SiteLocation.persistence.SimpleUser;

@Path("feedback")
@Stateless
public class FeedbackService implements FeedbackServiceRemote {

	@PersistenceContext
    private EntityManager em;
    
   @Override
    public Feedback saveFeedback(Feedback feedback, int idSimpleUser1, int idSimpleUser2 ){
        
	   FeedbackPk feedbackPk = new FeedbackPk();
       feedbackPk.setIdSimpleUser1(idSimpleUser1);
       feedbackPk.setIdSimpleUser2(idSimpleUser2);
       feedback.setDateFeedback(new Date());    
       feedback.setFeedbackPk(feedbackPk);
       em.persist(feedback);
      // SimpleUser simpleUser2 = em.find(SimpleUser.class, idSimpleUser2);
      // simpleUser2.setUserRank((this.getRunk(idSimpleUser2)));
       
       return feedback;
    }
   
   
   
    
    @Override
public Feedback saveRunk(Feedback feedback, int idSimpleUser1, int idSimpleUser2) {
    	   FeedbackPk feedbackPk = new FeedbackPk();
           feedbackPk.setIdSimpleUser1(idSimpleUser1);
           feedbackPk.setIdSimpleUser2(idSimpleUser2);
           feedback.setDateFeedback(new Date());    
           feedback.setFeedbackPk(feedbackPk);
           em.persist(feedback);
           SimpleUser simpleUser2 = em.find(SimpleUser.class, idSimpleUser2);
           simpleUser2.setUserRank((this.getRunk(idSimpleUser2)));
           
           return feedback;
}




	@Override
    public List<Feedback> getFeedbacksBySimpleUser(int idSimpleUser){
        
        TypedQuery<Feedback>  q =  em.createQuery("Select DISTINCT a from Feedback a join a.feedbackPk p where p.idSimpleUser2 =:idSimpleUser   ", Feedback.class);
        q.setParameter("idSimpleUser", idSimpleUser);
        return q.getResultList();
        
    }
    
    @Override
    public double getRunk(int idSimpleUser) {
       double sum=0;
       int somme=0;
       List<Feedback> feedbacks = getFeedbacksBySimpleUser(idSimpleUser);
       for(int i =0;i<feedbacks.size();i++) {
    	   if( feedbacks.get(i).getRunk()!=0) {
            sum = sum + feedbacks.get(i).getRunk();
            somme= somme+1;
    	   }
       }

       return Math.floor((sum/somme)*10)/10 ;
   }
}
