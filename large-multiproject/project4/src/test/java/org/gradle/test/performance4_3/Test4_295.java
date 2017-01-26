package org.gradle.test.performance4_3;

import static org.junit.Assert.*;

public class Test4_295 {
    private final Production4_295 production = new Production4_295("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}