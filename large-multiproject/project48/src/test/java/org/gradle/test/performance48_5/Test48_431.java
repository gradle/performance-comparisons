package org.gradle.test.performance48_5;

import static org.junit.Assert.*;

public class Test48_431 {
    private final Production48_431 production = new Production48_431("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}