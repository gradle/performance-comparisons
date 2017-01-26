package org.gradle.test.performance48_5;

import static org.junit.Assert.*;

public class Test48_462 {
    private final Production48_462 production = new Production48_462("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}