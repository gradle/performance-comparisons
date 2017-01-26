package org.gradle.test.performance48_2;

import static org.junit.Assert.*;

public class Test48_171 {
    private final Production48_171 production = new Production48_171("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}