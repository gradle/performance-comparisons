package org.gradle.test.performance48_1;

import static org.junit.Assert.*;

public class Test48_52 {
    private final Production48_52 production = new Production48_52("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}