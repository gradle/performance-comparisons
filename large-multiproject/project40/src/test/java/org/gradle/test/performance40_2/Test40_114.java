package org.gradle.test.performance40_2;

import static org.junit.Assert.*;

public class Test40_114 {
    private final Production40_114 production = new Production40_114("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}