package org.gradle.test.performance40_2;

import static org.junit.Assert.*;

public class Test40_162 {
    private final Production40_162 production = new Production40_162("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}