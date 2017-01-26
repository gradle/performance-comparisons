package org.gradle.test.performance48_1;

import static org.junit.Assert.*;

public class Test48_37 {
    private final Production48_37 production = new Production48_37("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}