package org.gradle.test.performance48_2;

import static org.junit.Assert.*;

public class Test48_127 {
    private final Production48_127 production = new Production48_127("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}