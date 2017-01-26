package org.gradle.test.performance48_4;

import static org.junit.Assert.*;

public class Test48_361 {
    private final Production48_361 production = new Production48_361("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}