package org.gradle.test.performance48_2;

import static org.junit.Assert.*;

public class Test48_116 {
    private final Production48_116 production = new Production48_116("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}