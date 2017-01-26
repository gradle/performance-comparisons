package org.gradle.test.performance26_5;

import static org.junit.Assert.*;

public class Test26_433 {
    private final Production26_433 production = new Production26_433("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}