package org.gradle.test.performance48_2;

import static org.junit.Assert.*;

public class Test48_143 {
    private final Production48_143 production = new Production48_143("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}