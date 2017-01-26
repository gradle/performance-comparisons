package org.gradle.test.performance4_2;

import static org.junit.Assert.*;

public class Test4_118 {
    private final Production4_118 production = new Production4_118("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}