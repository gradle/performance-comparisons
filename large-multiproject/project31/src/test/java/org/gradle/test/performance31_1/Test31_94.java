package org.gradle.test.performance31_1;

import static org.junit.Assert.*;

public class Test31_94 {
    private final Production31_94 production = new Production31_94("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}