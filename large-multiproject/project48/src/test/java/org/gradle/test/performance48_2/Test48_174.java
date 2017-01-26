package org.gradle.test.performance48_2;

import static org.junit.Assert.*;

public class Test48_174 {
    private final Production48_174 production = new Production48_174("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}