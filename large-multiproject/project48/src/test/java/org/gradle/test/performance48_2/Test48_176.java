package org.gradle.test.performance48_2;

import static org.junit.Assert.*;

public class Test48_176 {
    private final Production48_176 production = new Production48_176("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}