package org.gradle.test.performance40_1;

import static org.junit.Assert.*;

public class Test40_4 {
    private final Production40_4 production = new Production40_4("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}