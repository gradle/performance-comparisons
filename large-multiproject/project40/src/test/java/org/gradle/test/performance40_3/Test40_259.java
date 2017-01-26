package org.gradle.test.performance40_3;

import static org.junit.Assert.*;

public class Test40_259 {
    private final Production40_259 production = new Production40_259("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}