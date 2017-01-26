package org.gradle.test.performance42_5;

import static org.junit.Assert.*;

public class Test42_433 {
    private final Production42_433 production = new Production42_433("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}