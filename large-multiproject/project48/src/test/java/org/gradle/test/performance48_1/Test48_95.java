package org.gradle.test.performance48_1;

import static org.junit.Assert.*;

public class Test48_95 {
    private final Production48_95 production = new Production48_95("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}