package org.gradle.test.performance48_1;

import static org.junit.Assert.*;

public class Test48_99 {
    private final Production48_99 production = new Production48_99("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}