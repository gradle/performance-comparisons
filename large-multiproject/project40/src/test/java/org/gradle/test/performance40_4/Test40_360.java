package org.gradle.test.performance40_4;

import static org.junit.Assert.*;

public class Test40_360 {
    private final Production40_360 production = new Production40_360("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}