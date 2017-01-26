package org.gradle.test.performance48_5;

import static org.junit.Assert.*;

public class Test48_401 {
    private final Production48_401 production = new Production48_401("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}