package org.gradle.test.performance40_5;

import static org.junit.Assert.*;

public class Test40_424 {
    private final Production40_424 production = new Production40_424("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}