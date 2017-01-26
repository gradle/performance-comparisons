package org.gradle.test.performance4_2;

import static org.junit.Assert.*;

public class Test4_101 {
    private final Production4_101 production = new Production4_101("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}