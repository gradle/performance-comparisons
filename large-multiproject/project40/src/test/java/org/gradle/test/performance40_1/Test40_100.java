package org.gradle.test.performance40_1;

import static org.junit.Assert.*;

public class Test40_100 {
    private final Production40_100 production = new Production40_100("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}