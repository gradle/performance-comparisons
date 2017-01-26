package org.gradle.test.performance40_2;

import static org.junit.Assert.*;

public class Test40_106 {
    private final Production40_106 production = new Production40_106("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}