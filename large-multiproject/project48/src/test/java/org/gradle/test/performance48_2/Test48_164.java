package org.gradle.test.performance48_2;

import static org.junit.Assert.*;

public class Test48_164 {
    private final Production48_164 production = new Production48_164("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}