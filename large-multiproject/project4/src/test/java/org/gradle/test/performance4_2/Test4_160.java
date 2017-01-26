package org.gradle.test.performance4_2;

import static org.junit.Assert.*;

public class Test4_160 {
    private final Production4_160 production = new Production4_160("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}