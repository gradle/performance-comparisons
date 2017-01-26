package org.gradle.test.performance48_3;

import static org.junit.Assert.*;

public class Test48_227 {
    private final Production48_227 production = new Production48_227("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}