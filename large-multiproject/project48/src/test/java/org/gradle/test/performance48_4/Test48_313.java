package org.gradle.test.performance48_4;

import static org.junit.Assert.*;

public class Test48_313 {
    private final Production48_313 production = new Production48_313("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}