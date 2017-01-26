package org.gradle.test.performance40_3;

import static org.junit.Assert.*;

public class Test40_235 {
    private final Production40_235 production = new Production40_235("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}