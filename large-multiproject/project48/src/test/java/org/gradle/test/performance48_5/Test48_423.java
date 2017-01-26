package org.gradle.test.performance48_5;

import static org.junit.Assert.*;

public class Test48_423 {
    private final Production48_423 production = new Production48_423("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}