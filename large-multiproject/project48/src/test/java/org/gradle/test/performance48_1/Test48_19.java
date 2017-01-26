package org.gradle.test.performance48_1;

import static org.junit.Assert.*;

public class Test48_19 {
    private final Production48_19 production = new Production48_19("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}