package org.gradle.test.performance40_2;

import static org.junit.Assert.*;

public class Test40_154 {
    private final Production40_154 production = new Production40_154("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}