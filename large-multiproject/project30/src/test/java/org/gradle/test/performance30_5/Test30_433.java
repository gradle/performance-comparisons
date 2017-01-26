package org.gradle.test.performance30_5;

import static org.junit.Assert.*;

public class Test30_433 {
    private final Production30_433 production = new Production30_433("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}