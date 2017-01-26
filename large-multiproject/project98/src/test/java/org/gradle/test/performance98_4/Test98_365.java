package org.gradle.test.performance98_4;

import static org.junit.Assert.*;

public class Test98_365 {
    private final Production98_365 production = new Production98_365("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}