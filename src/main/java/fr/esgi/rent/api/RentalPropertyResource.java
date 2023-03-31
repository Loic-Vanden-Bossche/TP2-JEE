package fr.esgi.rent.api;

import fr.esgi.rent.beans.RentalProperty;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

import java.util.ArrayList;
import java.util.List;

@Path("/rental-properties")
public class RentalPropertyResource {
    @GET
    public List<RentalProperty> getRentalProperties() {
        return new ArrayList<>();
    }
}
