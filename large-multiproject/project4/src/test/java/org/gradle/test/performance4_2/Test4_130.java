package org.gradle.test.performance4_2;

import static org.junit.Assert.*;

public class Test4_130 {
    private final Production4_130 production = new Production4_130("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}