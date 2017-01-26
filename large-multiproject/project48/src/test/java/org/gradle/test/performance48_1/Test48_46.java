package org.gradle.test.performance48_1;

import static org.junit.Assert.*;

public class Test48_46 {
    private final Production48_46 production = new Production48_46("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}