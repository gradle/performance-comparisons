package org.gradle.test.performance40_3;

import static org.junit.Assert.*;

public class Test40_253 {
    private final Production40_253 production = new Production40_253("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}