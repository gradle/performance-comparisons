package org.gradle.test.performance48_3;

import static org.junit.Assert.*;

public class Test48_210 {
    private final Production48_210 production = new Production48_210("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}