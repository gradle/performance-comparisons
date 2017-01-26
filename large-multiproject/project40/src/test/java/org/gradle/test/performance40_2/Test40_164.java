package org.gradle.test.performance40_2;

import static org.junit.Assert.*;

public class Test40_164 {
    private final Production40_164 production = new Production40_164("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}