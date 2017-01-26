package org.gradle.test.performance48_3;

import static org.junit.Assert.*;

public class Test48_254 {
    private final Production48_254 production = new Production48_254("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}