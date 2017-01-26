package org.gradle.test.performance48_1;

import static org.junit.Assert.*;

public class Test48_86 {
    private final Production48_86 production = new Production48_86("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}