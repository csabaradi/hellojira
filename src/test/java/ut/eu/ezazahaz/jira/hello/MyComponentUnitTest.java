package ut.eu.ezazahaz.jira.hello;

import org.junit.Test;
import eu.ezazahaz.jira.hello.api.MyPluginComponent;
import eu.ezazahaz.jira.hello.impl.MyPluginComponentImpl;

import static org.junit.Assert.assertEquals;

public class MyComponentUnitTest
{
    @Test
    public void testMyName()
    {
        MyPluginComponent component = new MyPluginComponentImpl(null);
        assertEquals("names do not match!", "myComponent",component.getName());
    }
}