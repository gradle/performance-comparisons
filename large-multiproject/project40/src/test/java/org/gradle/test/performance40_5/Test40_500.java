package org.gradle.test.performance40_5;

import static org.junit.Assert.*;

public class Test40_500 {
    private final Production40_500 production = new Production40_500("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}