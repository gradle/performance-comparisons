package org.gradle.test.performance48_1;

import static org.junit.Assert.*;

public class Test48_83 {
    private final Production48_83 production = new Production48_83("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}