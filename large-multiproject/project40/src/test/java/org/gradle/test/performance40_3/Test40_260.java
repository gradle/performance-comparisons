package org.gradle.test.performance40_3;

import static org.junit.Assert.*;

public class Test40_260 {
    private final Production40_260 production = new Production40_260("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}