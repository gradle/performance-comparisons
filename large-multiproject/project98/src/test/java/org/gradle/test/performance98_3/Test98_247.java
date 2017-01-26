package org.gradle.test.performance98_3;

import static org.junit.Assert.*;

public class Test98_247 {
    private final Production98_247 production = new Production98_247("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}