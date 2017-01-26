package org.gradle.test.performance48_1;

import static org.junit.Assert.*;

public class Test48_53 {
    private final Production48_53 production = new Production48_53("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}