package org.gradle.test.performance48_2;

import static org.junit.Assert.*;

public class Test48_151 {
    private final Production48_151 production = new Production48_151("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}