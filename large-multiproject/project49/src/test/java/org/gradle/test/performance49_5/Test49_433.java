package org.gradle.test.performance49_5;

import static org.junit.Assert.*;

public class Test49_433 {
    private final Production49_433 production = new Production49_433("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}