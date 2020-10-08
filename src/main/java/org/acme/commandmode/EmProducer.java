package org.acme.commandmode;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.Dependent;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@ApplicationScoped
public class EmProducer {

    @Produces
    @PersistenceContext
    @UnWrapped
    EntityManager entityManager;

    @Produces
    @Dependent
    EntityManager delegate() {
        return new WrappedEntityManager(entityManager);
    }

}
