package org.gradle.test.performance48_3;

import static org.junit.Assert.*;

public class Test48_242 {
    private final Production48_242 production = new Production48_242("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}