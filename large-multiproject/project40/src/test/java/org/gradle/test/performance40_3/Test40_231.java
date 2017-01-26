package org.gradle.test.performance40_3;

import static org.junit.Assert.*;

public class Test40_231 {
    private final Production40_231 production = new Production40_231("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}