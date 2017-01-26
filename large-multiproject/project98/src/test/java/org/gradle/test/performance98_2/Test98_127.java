package org.gradle.test.performance98_2;

import static org.junit.Assert.*;

public class Test98_127 {
    private final Production98_127 production = new Production98_127("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}