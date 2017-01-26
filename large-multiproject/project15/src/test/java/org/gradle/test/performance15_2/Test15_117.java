package org.gradle.test.performance15_2;

import static org.junit.Assert.*;

public class Test15_117 {
    private final Production15_117 production = new Production15_117("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}