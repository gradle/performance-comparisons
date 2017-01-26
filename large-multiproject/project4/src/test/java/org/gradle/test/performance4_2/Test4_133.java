package org.gradle.test.performance4_2;

import static org.junit.Assert.*;

public class Test4_133 {
    private final Production4_133 production = new Production4_133("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}