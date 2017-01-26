package org.gradle.test.performance48_5;

import static org.junit.Assert.*;

public class Test48_434 {
    private final Production48_434 production = new Production48_434("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}