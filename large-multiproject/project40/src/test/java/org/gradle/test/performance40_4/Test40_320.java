package org.gradle.test.performance40_4;

import static org.junit.Assert.*;

public class Test40_320 {
    private final Production40_320 production = new Production40_320("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}