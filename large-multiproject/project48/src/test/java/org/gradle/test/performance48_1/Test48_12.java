package org.gradle.test.performance48_1;

import static org.junit.Assert.*;

public class Test48_12 {
    private final Production48_12 production = new Production48_12("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}