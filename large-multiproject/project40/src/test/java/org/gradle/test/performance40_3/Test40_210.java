package org.gradle.test.performance40_3;

import static org.junit.Assert.*;

public class Test40_210 {
    private final Production40_210 production = new Production40_210("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}