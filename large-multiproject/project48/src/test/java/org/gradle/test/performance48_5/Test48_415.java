package org.gradle.test.performance48_5;

import static org.junit.Assert.*;

public class Test48_415 {
    private final Production48_415 production = new Production48_415("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}