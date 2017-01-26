package org.gradle.test.performance48_2;

import static org.junit.Assert.*;

public class Test48_104 {
    private final Production48_104 production = new Production48_104("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}