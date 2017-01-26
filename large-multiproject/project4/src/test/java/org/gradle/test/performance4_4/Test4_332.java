package org.gradle.test.performance4_4;

import static org.junit.Assert.*;

public class Test4_332 {
    private final Production4_332 production = new Production4_332("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}