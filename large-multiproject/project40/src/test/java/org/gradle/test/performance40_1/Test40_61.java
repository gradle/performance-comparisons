package org.gradle.test.performance40_1;

import static org.junit.Assert.*;

public class Test40_61 {
    private final Production40_61 production = new Production40_61("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}