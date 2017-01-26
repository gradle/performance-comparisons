package org.gradle.test.performance31_2;

import static org.junit.Assert.*;

public class Test31_170 {
    private final Production31_170 production = new Production31_170("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}