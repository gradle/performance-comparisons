package org.gradle.test.performance31_3;

import static org.junit.Assert.*;

public class Test31_244 {
    private final Production31_244 production = new Production31_244("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}