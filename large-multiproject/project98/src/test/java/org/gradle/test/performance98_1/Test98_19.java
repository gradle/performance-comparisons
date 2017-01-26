package org.gradle.test.performance98_1;

import static org.junit.Assert.*;

public class Test98_19 {
    private final Production98_19 production = new Production98_19("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}