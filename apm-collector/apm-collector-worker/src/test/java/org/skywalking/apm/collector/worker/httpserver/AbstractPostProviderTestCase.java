package org.skywalking.apm.collector.worker.httpserver;

import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import org.junit.Test;
import org.mockito.Mockito;
import org.skywalking.apm.collector.actor.ProviderNotFoundException;

/**
 * @author pengys5
 */
public class AbstractPostProviderTestCase {

    @Test
    public void testCreate() throws IllegalArgumentException, ProviderNotFoundException {
        ServletContextHandler handler = Mockito.mock(ServletContextHandler.class);

        TestAbstractPostProvider provider = new TestAbstractPostProvider();
        provider.create(handler);
        Mockito.verify(handler).addServlet(Mockito.any(ServletHolder.class), Mockito.eq("testPost"));
    }
}
