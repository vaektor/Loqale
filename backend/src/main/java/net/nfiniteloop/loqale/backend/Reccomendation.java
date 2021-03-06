package net.nfiniteloop.loqale.backend;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;
import com.googlecode.objectify.annotation.Index;

import java.util.Date;

/**
 * Created by vaek on 10/6/14.
 *
 * Recommendation Class for Recommender App
 * Generic container for Place, Tag and Friend Recommendations
 */
enum RecommendationType {PLACE, TAG, USER}

@Entity
class Recommendation {
    @Id
    private Long id;
    @Index
    private String recommendationId;
    private Date date;
    // TODO: Add private String explanation;
    private RecommendationType recommendationType;
    private String contentId;

    public Date getDate() {
        return date;
    }

    public RecommendationType getRecommendationType() {
        return recommendationType;
    }

    public String getRecommendationId() {
        return recommendationId;
    }

    public String getContentId() {
        return contentId;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setRecommendationType(RecommendationType type) {
        this.recommendationType = type;
    }

    public void setRecommendationId(String recommendationId) {
        this.recommendationId = recommendationId;
    }

    public void setContentId(String contentId) {
        this.contentId = contentId;
    }
}
