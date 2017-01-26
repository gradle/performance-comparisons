package org.gradle.test.performance15_5;

import static org.junit.Assert.*;

public class Test15_433 {
    private final Production15_433 production = new Production15_433("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}