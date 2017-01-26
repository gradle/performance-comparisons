package org.gradle.test.performance48_2;

import static org.junit.Assert.*;

public class Test48_152 {
    private final Production48_152 production = new Production48_152("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}