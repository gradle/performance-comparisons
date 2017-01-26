package org.gradle.test.performance79_5;

import static org.junit.Assert.*;

public class Test79_433 {
    private final Production79_433 production = new Production79_433("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}