package org.gradle.test.performance40_1;

import static org.junit.Assert.*;

public class Test40_47 {
    private final Production40_47 production = new Production40_47("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}