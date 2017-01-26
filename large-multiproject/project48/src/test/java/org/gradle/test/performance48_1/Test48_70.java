package org.gradle.test.performance48_1;

import static org.junit.Assert.*;

public class Test48_70 {
    private final Production48_70 production = new Production48_70("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}