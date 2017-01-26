package org.gradle.test.performance39_5;

import static org.junit.Assert.*;

public class Test39_433 {
    private final Production39_433 production = new Production39_433("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}