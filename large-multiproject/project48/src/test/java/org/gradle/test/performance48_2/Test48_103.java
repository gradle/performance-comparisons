package org.gradle.test.performance48_2;

import static org.junit.Assert.*;

public class Test48_103 {
    private final Production48_103 production = new Production48_103("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}