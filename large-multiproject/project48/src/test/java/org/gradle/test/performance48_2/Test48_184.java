package org.gradle.test.performance48_2;

import static org.junit.Assert.*;

public class Test48_184 {
    private final Production48_184 production = new Production48_184("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}