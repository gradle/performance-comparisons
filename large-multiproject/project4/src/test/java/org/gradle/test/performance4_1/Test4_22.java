package org.gradle.test.performance4_1;

import static org.junit.Assert.*;

public class Test4_22 {
    private final Production4_22 production = new Production4_22("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}