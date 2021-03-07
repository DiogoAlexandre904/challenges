package challenges.flow;

import flow.*;
import flow.samples.TextAdapter;
import flow.samples.TextAgent;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.HashMap;
import java.util.Map;

@RunWith(JUnit4.class)
public class EmailTest {

  @Test
  public void testRun_AdapterIsCompliantWithProtocol_AppHasHelloMessage() throws Exception {
    IAgent user = new TextAgent("hello");
    Map<String, IAdapter> adapters = new HashMap<String, IAdapter>();
    adapters.put("EMAIL", new TextAdapter());

    EmailApp app = new EmailApp();
    Engine engine = new Engine(user, adapters, app);
    engine.run();
    Assert.assertEquals("hello", app.popMessage());
  }
}
