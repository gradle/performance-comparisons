package org.gradle.test.performance48_5;

import static org.junit.Assert.*;

public class Test48_417 {
    private final Production48_417 production = new Production48_417("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}