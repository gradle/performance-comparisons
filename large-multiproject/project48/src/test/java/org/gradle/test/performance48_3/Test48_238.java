package org.gradle.test.performance48_3;

import static org.junit.Assert.*;

public class Test48_238 {
    private final Production48_238 production = new Production48_238("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}