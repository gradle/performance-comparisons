package org.gradle.test.performance4_4;

import static org.junit.Assert.*;

public class Test4_335 {
    private final Production4_335 production = new Production4_335("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}