package org.gradle.test.performance48_1;

import static org.junit.Assert.*;

public class Test48_18 {
    private final Production48_18 production = new Production48_18("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}