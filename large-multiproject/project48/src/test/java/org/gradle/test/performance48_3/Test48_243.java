package org.gradle.test.performance48_3;

import static org.junit.Assert.*;

public class Test48_243 {
    private final Production48_243 production = new Production48_243("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}