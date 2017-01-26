package org.gradle.test.performance40_3;

import static org.junit.Assert.*;

public class Test40_289 {
    private final Production40_289 production = new Production40_289("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}