package org.gradle.test.performance48_5;

import static org.junit.Assert.*;

public class Test48_486 {
    private final Production48_486 production = new Production48_486("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}