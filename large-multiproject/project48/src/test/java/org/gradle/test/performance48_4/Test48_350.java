package org.gradle.test.performance48_4;

import static org.junit.Assert.*;

public class Test48_350 {
    private final Production48_350 production = new Production48_350("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}