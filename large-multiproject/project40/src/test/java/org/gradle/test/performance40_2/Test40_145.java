package org.gradle.test.performance40_2;

import static org.junit.Assert.*;

public class Test40_145 {
    private final Production40_145 production = new Production40_145("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}