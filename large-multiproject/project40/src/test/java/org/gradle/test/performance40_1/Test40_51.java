package org.gradle.test.performance40_1;

import static org.junit.Assert.*;

public class Test40_51 {
    private final Production40_51 production = new Production40_51("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}