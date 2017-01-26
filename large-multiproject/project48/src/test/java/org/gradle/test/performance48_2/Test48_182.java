package org.gradle.test.performance48_2;

import static org.junit.Assert.*;

public class Test48_182 {
    private final Production48_182 production = new Production48_182("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}