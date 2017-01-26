package org.gradle.test.performance48_5;

import static org.junit.Assert.*;

public class Test48_485 {
    private final Production48_485 production = new Production48_485("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}