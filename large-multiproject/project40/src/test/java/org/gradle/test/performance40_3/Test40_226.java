package org.gradle.test.performance40_3;

import static org.junit.Assert.*;

public class Test40_226 {
    private final Production40_226 production = new Production40_226("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}