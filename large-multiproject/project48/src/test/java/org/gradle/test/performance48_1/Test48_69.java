package org.gradle.test.performance48_1;

import static org.junit.Assert.*;

public class Test48_69 {
    private final Production48_69 production = new Production48_69("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}