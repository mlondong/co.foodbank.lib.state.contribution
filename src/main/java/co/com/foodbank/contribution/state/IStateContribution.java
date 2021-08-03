package co.com.foodbank.contribution.state;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * Interface to handle all states in Contributions.
 * 
 * @author mauricio.londono@gmail.com co.com.foodbank.contribution.dto
 *         10/06/2021
 */

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY,
        property = "type")
@JsonSubTypes({@Type(value = Pending.class, name = "Pending"),
        @Type(value = Delyvered.class, name = "Delyvered"),
        @Type(value = InHouse.class, name = "InHouse"),
        @Type(value = PickedUp.class, name = "PickedUp"),
        @Type(value = Shipment.class, name = "Shipment")})
public interface IStateContribution {

    /*
     * 1. STATE PENDING (PROVIDER) 2. STATE PICKED (PROVIDER) 3. STATE INHOUSE
     * (THE CONTRIBUTION IS IN FOOD BANK) 4. STATE SHIP (BENEFIACIARY) 5. STATE
     * DELIVERED(NENEFICIARY)
     */

    /* WHEN THE CONTRIBUTIONS IS IN FOOD BANK */
    void inHouse(ContributionData contribution);

    /* WHEN THE CONTRIBUTIONS IS PICKED IN PROVIDER */
    void picked(ContributionData contribution);

    /* WHEN THE CONTRIBUTIONS IS PENDING TP PICK UP OR DELIVER */
    void pending(ContributionData contribution);

    /* WHEN THE CONTRIBUTIONS IS DELIVERED IN BENEFICIARY */
    void delyvered(ContributionData contribution);

    /* WHEN THE CONTRIBUTIONS IS SHIPMENT IN PROVIDER OR BENEFICIARY */
    void ship(ContributionData contribution);
}
