package org.gradle.test.performance40_5;

import static org.junit.Assert.*;

public class Test40_431 {
    private final Production40_431 production = new Production40_431("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}