package org.gradle.test.performance4_2;

import static org.junit.Assert.*;

public class Test4_124 {
    private final Production4_124 production = new Production4_124("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}