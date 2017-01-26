package org.gradle.test.performance48_2;

import static org.junit.Assert.*;

public class Test48_156 {
    private final Production48_156 production = new Production48_156("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}