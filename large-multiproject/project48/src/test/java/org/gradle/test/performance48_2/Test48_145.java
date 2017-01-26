package org.gradle.test.performance48_2;

import static org.junit.Assert.*;

public class Test48_145 {
    private final Production48_145 production = new Production48_145("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}