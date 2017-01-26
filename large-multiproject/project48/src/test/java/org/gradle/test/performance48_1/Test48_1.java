package org.gradle.test.performance48_1;

import static org.junit.Assert.*;

public class Test48_1 {
    private final Production48_1 production = new Production48_1("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}