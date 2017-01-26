package org.gradle.test.performance40_5;

import static org.junit.Assert.*;

public class Test40_458 {
    private final Production40_458 production = new Production40_458("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}