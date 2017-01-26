package org.gradle.test.performance40_4;

import static org.junit.Assert.*;

public class Test40_358 {
    private final Production40_358 production = new Production40_358("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}