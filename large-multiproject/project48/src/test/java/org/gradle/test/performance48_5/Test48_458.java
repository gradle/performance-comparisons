package org.gradle.test.performance48_5;

import static org.junit.Assert.*;

public class Test48_458 {
    private final Production48_458 production = new Production48_458("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}