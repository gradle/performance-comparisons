package org.gradle.test.performance48_1;

import static org.junit.Assert.*;

public class Test48_87 {
    private final Production48_87 production = new Production48_87("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}