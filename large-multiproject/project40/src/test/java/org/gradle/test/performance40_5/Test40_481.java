package org.gradle.test.performance40_5;

import static org.junit.Assert.*;

public class Test40_481 {
    private final Production40_481 production = new Production40_481("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}