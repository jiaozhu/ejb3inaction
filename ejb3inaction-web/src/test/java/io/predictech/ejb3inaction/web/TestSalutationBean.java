package io.predictech.ejb3inaction.web;

import io.predictech.ejb3inaction.ejb.Salutation;
import org.junit.Test;

import javax.naming.Context;
import javax.naming.InitialContext;
import java.util.Hashtable;

/**
 * @author Weijie Zhao
 * @email tttx(at)me.com
 * @date 2018/4/30
 * @description
 */
public class TestSalutationBean {

    @Test
    public void testgetFormalSalutation() throws Exception {
        Hashtable env = new Hashtable();
        env.put("java.naming.factory.initial",
                "weblogic.jndi.WLInitialContextFactory");
        env.put("java.naming.provider.url", "t3://127.0.0.1:7001");
        Context ctx = new InitialContext(env);

        Salutation salutation = (Salutation) ctx.lookup("SalutationBean#io.predictech.ejb3inaction.ejb.Salutation");

        System.out.println(salutation.getFormalSalutation("Weijie Zhao"));
    }
}
