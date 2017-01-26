package org.gradle.test.performance40_3;

import static org.junit.Assert.*;

public class Test40_239 {
    private final Production40_239 production = new Production40_239("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}