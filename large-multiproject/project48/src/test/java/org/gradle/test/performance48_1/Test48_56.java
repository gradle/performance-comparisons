package org.gradle.test.performance48_1;

import static org.junit.Assert.*;

public class Test48_56 {
    private final Production48_56 production = new Production48_56("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}