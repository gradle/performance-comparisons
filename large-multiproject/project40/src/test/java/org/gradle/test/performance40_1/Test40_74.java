package org.gradle.test.performance40_1;

import static org.junit.Assert.*;

public class Test40_74 {
    private final Production40_74 production = new Production40_74("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}