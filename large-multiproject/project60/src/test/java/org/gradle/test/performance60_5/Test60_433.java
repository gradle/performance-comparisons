package org.gradle.test.performance60_5;

import static org.junit.Assert.*;

public class Test60_433 {
    private final Production60_433 production = new Production60_433("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}