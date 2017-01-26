package org.gradle.test.performance98_1;

import static org.junit.Assert.*;

public class Test98_70 {
    private final Production98_70 production = new Production98_70("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}