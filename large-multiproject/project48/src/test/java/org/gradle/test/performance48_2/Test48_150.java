package org.gradle.test.performance48_2;

import static org.junit.Assert.*;

public class Test48_150 {
    private final Production48_150 production = new Production48_150("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}