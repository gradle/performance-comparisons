package org.gradle.test.performance48_2;

import static org.junit.Assert.*;

public class Test48_175 {
    private final Production48_175 production = new Production48_175("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}