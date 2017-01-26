package org.gradle.test.performance4_4;

import static org.junit.Assert.*;

public class Test4_359 {
    private final Production4_359 production = new Production4_359("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}