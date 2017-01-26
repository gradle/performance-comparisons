package org.gradle.test.performance40_4;

import static org.junit.Assert.*;

public class Test40_371 {
    private final Production40_371 production = new Production40_371("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}