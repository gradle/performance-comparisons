package org.gradle.test.performance31_2;

import static org.junit.Assert.*;

public class Test31_158 {
    private final Production31_158 production = new Production31_158("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}