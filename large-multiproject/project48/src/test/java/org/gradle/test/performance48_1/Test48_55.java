package org.gradle.test.performance48_1;

import static org.junit.Assert.*;

public class Test48_55 {
    private final Production48_55 production = new Production48_55("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}