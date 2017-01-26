package org.gradle.test.performance68_4;

import static org.junit.Assert.*;

public class Test68_310 {
    private final Production68_310 production = new Production68_310("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}