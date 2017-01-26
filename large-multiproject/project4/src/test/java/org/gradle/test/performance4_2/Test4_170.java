package org.gradle.test.performance4_2;

import static org.junit.Assert.*;

public class Test4_170 {
    private final Production4_170 production = new Production4_170("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}