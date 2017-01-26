package org.gradle.test.performance48_2;

import static org.junit.Assert.*;

public class Test48_105 {
    private final Production48_105 production = new Production48_105("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}