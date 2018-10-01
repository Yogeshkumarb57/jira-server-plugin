package ut.com.jira.sample;

import org.junit.Test;
import com.jira.sample.api.MyPluginComponent;
import com.jira.sample.impl.MyPluginComponentImpl;

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