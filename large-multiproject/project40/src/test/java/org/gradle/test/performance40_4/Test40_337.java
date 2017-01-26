package org.gradle.test.performance40_4;

import static org.junit.Assert.*;

public class Test40_337 {
    private final Production40_337 production = new Production40_337("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}