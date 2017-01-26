package org.gradle.test.performance31_3;

import static org.junit.Assert.*;

public class Test31_291 {
    private final Production31_291 production = new Production31_291("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}