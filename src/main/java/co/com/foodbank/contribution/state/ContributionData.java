package co.com.foodbank.contribution.state;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonIgnore;
import co.com.foodbank.vehicule.dto.Volume;

/**
 * Class contain all parameteres for contribution general and detail
 * 
 * @author mauricio.londono@gmail.com co.com.foodbank.contribution.dto
 *         11/06/2021
 */
public class ContributionData {

    /* Parameters of Contribution */
    private String description;
    private Date date;

    @JsonIgnore(value = true)
    private IStateContribution state;

    /* Parameters of Contribution Detail */
    private String codeBar;
    private Long numOfPackage;

    /* Parameters of Contribution General */
    private Volume volume;



    /**
     * Default constructor.
     */
    public ContributionData() {}


    public String getCodeBar() {
        return codeBar;
    }

    public void setCodeBar(String codeBar) {
        this.codeBar = codeBar;
    }

    public Long getNumOfPackage() {
        return numOfPackage;
    }

    public void setNumOfPackage(Long numOfPackage) {
        this.numOfPackage = numOfPackage;
    }

    public Volume getVolume() {
        return volume;
    }

    public void setVolume(Volume volume) {
        this.volume = volume;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public IStateContribution getState() {
        return state;
    }

    public void setState(IStateContribution state) {
        this.state = state;
    }


    @Override
    public String toString() {
        return "ContributionData [description=" + description + ", date=" + date
                + ", state=" + state + ", codeBar=" + codeBar
                + ", numOfPackage=" + numOfPackage + ", volume=" + volume + "]";
    }



}
