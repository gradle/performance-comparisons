package org.gradle.test.performance48_3;

import static org.junit.Assert.*;

public class Test48_203 {
    private final Production48_203 production = new Production48_203("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}