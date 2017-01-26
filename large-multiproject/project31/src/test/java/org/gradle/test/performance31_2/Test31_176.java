package org.gradle.test.performance31_2;

import static org.junit.Assert.*;

public class Test31_176 {
    private final Production31_176 production = new Production31_176("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}