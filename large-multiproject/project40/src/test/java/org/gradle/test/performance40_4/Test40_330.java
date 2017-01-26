package org.gradle.test.performance40_4;

import static org.junit.Assert.*;

public class Test40_330 {
    private final Production40_330 production = new Production40_330("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}