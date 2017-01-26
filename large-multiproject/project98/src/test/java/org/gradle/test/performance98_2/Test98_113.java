package org.gradle.test.performance98_2;

import static org.junit.Assert.*;

public class Test98_113 {
    private final Production98_113 production = new Production98_113("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}