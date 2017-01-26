package org.gradle.test.performance4_2;

import static org.junit.Assert.*;

public class Test4_141 {
    private final Production4_141 production = new Production4_141("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}