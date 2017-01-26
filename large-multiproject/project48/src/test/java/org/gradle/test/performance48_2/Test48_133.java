package org.gradle.test.performance48_2;

import static org.junit.Assert.*;

public class Test48_133 {
    private final Production48_133 production = new Production48_133("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}