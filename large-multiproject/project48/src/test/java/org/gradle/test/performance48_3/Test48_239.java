package org.gradle.test.performance48_3;

import static org.junit.Assert.*;

public class Test48_239 {
    private final Production48_239 production = new Production48_239("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}