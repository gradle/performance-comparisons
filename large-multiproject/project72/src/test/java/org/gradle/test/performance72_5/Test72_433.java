package org.gradle.test.performance72_5;

import static org.junit.Assert.*;

public class Test72_433 {
    private final Production72_433 production = new Production72_433("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}