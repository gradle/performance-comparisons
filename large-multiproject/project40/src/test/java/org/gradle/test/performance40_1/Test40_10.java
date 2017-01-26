package org.gradle.test.performance40_1;

import static org.junit.Assert.*;

public class Test40_10 {
    private final Production40_10 production = new Production40_10("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}