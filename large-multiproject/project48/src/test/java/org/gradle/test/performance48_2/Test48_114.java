package org.gradle.test.performance48_2;

import static org.junit.Assert.*;

public class Test48_114 {
    private final Production48_114 production = new Production48_114("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}