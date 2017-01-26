package org.gradle.test.performance98_2;

import static org.junit.Assert.*;

public class Test98_109 {
    private final Production98_109 production = new Production98_109("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}