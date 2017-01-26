package org.gradle.test.performance48_4;

import static org.junit.Assert.*;

public class Test48_329 {
    private final Production48_329 production = new Production48_329("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}