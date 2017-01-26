package org.gradle.test.performance98_2;

import static org.junit.Assert.*;

public class Test98_142 {
    private final Production98_142 production = new Production98_142("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}