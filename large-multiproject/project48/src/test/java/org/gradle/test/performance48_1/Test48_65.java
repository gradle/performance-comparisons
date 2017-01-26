package org.gradle.test.performance48_1;

import static org.junit.Assert.*;

public class Test48_65 {
    private final Production48_65 production = new Production48_65("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}