package org.gradle.test.performance98_2;

import static org.junit.Assert.*;

public class Test98_165 {
    private final Production98_165 production = new Production98_165("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}