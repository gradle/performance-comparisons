package org.gradle.test.performance40_1;

import static org.junit.Assert.*;

public class Test40_42 {
    private final Production40_42 production = new Production40_42("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}