package org.gradle.test.performance40_2;

import static org.junit.Assert.*;

public class Test40_150 {
    private final Production40_150 production = new Production40_150("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}