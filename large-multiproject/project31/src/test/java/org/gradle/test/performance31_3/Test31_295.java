package org.gradle.test.performance31_3;

import static org.junit.Assert.*;

public class Test31_295 {
    private final Production31_295 production = new Production31_295("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}