package org.gradle.test.performance48_5;

import static org.junit.Assert.*;

public class Test48_492 {
    private final Production48_492 production = new Production48_492("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}