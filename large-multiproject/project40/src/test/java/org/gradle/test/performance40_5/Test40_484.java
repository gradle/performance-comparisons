package org.gradle.test.performance40_5;

import static org.junit.Assert.*;

public class Test40_484 {
    private final Production40_484 production = new Production40_484("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}