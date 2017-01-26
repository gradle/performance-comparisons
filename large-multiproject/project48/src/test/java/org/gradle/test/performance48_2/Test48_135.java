package org.gradle.test.performance48_2;

import static org.junit.Assert.*;

public class Test48_135 {
    private final Production48_135 production = new Production48_135("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}