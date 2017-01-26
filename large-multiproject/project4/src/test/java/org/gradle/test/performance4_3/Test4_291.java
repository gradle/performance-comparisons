package org.gradle.test.performance4_3;

import static org.junit.Assert.*;

public class Test4_291 {
    private final Production4_291 production = new Production4_291("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}