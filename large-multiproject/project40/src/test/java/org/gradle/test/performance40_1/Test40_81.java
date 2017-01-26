package org.gradle.test.performance40_1;

import static org.junit.Assert.*;

public class Test40_81 {
    private final Production40_81 production = new Production40_81("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}