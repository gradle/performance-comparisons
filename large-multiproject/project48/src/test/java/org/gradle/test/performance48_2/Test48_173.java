package org.gradle.test.performance48_2;

import static org.junit.Assert.*;

public class Test48_173 {
    private final Production48_173 production = new Production48_173("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}