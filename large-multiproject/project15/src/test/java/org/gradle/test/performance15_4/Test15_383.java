package org.gradle.test.performance15_4;

import static org.junit.Assert.*;

public class Test15_383 {
    private final Production15_383 production = new Production15_383("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}