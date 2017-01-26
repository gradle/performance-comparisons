package org.gradle.test.performance4_4;

import static org.junit.Assert.*;

public class Test4_344 {
    private final Production4_344 production = new Production4_344("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}