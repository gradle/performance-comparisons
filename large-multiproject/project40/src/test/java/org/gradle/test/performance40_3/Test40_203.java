package org.gradle.test.performance40_3;

import static org.junit.Assert.*;

public class Test40_203 {
    private final Production40_203 production = new Production40_203("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}