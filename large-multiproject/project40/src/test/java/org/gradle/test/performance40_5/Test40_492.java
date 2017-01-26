package org.gradle.test.performance40_5;

import static org.junit.Assert.*;

public class Test40_492 {
    private final Production40_492 production = new Production40_492("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}