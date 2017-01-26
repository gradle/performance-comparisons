package org.gradle.test.performance90_5;

import static org.junit.Assert.*;

public class Test90_433 {
    private final Production90_433 production = new Production90_433("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}