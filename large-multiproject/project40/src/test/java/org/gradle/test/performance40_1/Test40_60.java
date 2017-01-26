package org.gradle.test.performance40_1;

import static org.junit.Assert.*;

public class Test40_60 {
    private final Production40_60 production = new Production40_60("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}