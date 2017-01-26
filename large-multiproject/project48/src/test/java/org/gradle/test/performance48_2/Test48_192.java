package org.gradle.test.performance48_2;

import static org.junit.Assert.*;

public class Test48_192 {
    private final Production48_192 production = new Production48_192("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}