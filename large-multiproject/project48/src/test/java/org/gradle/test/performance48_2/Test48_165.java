package org.gradle.test.performance48_2;

import static org.junit.Assert.*;

public class Test48_165 {
    private final Production48_165 production = new Production48_165("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}