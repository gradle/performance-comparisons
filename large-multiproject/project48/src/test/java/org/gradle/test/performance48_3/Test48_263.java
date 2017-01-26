package org.gradle.test.performance48_3;

import static org.junit.Assert.*;

public class Test48_263 {
    private final Production48_263 production = new Production48_263("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}