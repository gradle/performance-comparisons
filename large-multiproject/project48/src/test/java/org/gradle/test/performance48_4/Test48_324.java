package org.gradle.test.performance48_4;

import static org.junit.Assert.*;

public class Test48_324 {
    private final Production48_324 production = new Production48_324("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}