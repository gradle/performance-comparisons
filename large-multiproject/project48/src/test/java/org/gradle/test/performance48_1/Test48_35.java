package org.gradle.test.performance48_1;

import static org.junit.Assert.*;

public class Test48_35 {
    private final Production48_35 production = new Production48_35("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}