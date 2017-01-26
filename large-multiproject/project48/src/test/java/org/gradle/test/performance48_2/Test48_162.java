package org.gradle.test.performance48_2;

import static org.junit.Assert.*;

public class Test48_162 {
    private final Production48_162 production = new Production48_162("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}