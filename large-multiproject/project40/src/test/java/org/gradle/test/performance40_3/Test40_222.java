package org.gradle.test.performance40_3;

import static org.junit.Assert.*;

public class Test40_222 {
    private final Production40_222 production = new Production40_222("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}