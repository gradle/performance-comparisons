package org.gradle.test.performance40_5;

import static org.junit.Assert.*;

public class Test40_437 {
    private final Production40_437 production = new Production40_437("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}