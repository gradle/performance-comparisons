package org.gradle.test.performance4_2;

import static org.junit.Assert.*;

public class Test4_185 {
    private final Production4_185 production = new Production4_185("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}