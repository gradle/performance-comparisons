package org.gradle.test.performance48_5;

import static org.junit.Assert.*;

public class Test48_484 {
    private final Production48_484 production = new Production48_484("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}