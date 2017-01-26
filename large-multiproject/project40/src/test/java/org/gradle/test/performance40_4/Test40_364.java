package org.gradle.test.performance40_4;

import static org.junit.Assert.*;

public class Test40_364 {
    private final Production40_364 production = new Production40_364("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}