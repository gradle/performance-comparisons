package org.gradle.test.performance62_5;

import static org.junit.Assert.*;

public class Test62_433 {
    private final Production62_433 production = new Production62_433("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}