package org.gradle.test.performance31_2;

import static org.junit.Assert.*;

public class Test31_108 {
    private final Production31_108 production = new Production31_108("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}