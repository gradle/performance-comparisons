package org.gradle.test.performance40_1;

import static org.junit.Assert.*;

public class Test40_35 {
    private final Production40_35 production = new Production40_35("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}