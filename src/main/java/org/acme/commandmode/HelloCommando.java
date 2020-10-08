package org.acme.commandmode;

import javax.enterprise.context.control.ActivateRequestContext;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;

@QuarkusMain
public class HelloCommando implements QuarkusApplication {

    @Inject
    EntityManager entityManager;

    @Override
    public int run(String... args) throws Exception {
        System.out.println("wrapped: " +(entityManager instanceof WrappedEntityManager));
        return 0;
    }
}
