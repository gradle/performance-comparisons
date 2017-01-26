package org.gradle.test.performance48_4;

import static org.junit.Assert.*;

public class Test48_386 {
    private final Production48_386 production = new Production48_386("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}