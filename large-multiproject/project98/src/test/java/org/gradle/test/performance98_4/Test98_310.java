package org.gradle.test.performance98_4;

import static org.junit.Assert.*;

public class Test98_310 {
    private final Production98_310 production = new Production98_310("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}