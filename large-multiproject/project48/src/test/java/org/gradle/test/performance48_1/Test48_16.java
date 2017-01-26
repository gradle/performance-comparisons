package org.gradle.test.performance48_1;

import static org.junit.Assert.*;

public class Test48_16 {
    private final Production48_16 production = new Production48_16("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}