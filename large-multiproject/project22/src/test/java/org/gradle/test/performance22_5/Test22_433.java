package org.gradle.test.performance22_5;

import static org.junit.Assert.*;

public class Test22_433 {
    private final Production22_433 production = new Production22_433("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}