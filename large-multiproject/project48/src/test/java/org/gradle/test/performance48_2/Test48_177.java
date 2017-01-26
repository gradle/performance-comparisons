package org.gradle.test.performance48_2;

import static org.junit.Assert.*;

public class Test48_177 {
    private final Production48_177 production = new Production48_177("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}