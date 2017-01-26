package org.gradle.test.performance40_2;

import static org.junit.Assert.*;

public class Test40_152 {
    private final Production40_152 production = new Production40_152("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}