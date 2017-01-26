package org.gradle.test.performance48_1;

import static org.junit.Assert.*;

public class Test48_51 {
    private final Production48_51 production = new Production48_51("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}