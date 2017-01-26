package org.gradle.test.performance40_1;

import static org.junit.Assert.*;

public class Test40_65 {
    private final Production40_65 production = new Production40_65("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}