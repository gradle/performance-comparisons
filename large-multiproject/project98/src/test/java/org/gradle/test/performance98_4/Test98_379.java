package org.gradle.test.performance98_4;

import static org.junit.Assert.*;

public class Test98_379 {
    private final Production98_379 production = new Production98_379("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}