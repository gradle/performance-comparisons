package org.gradle.test.performance40_4;

import static org.junit.Assert.*;

public class Test40_390 {
    private final Production40_390 production = new Production40_390("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}