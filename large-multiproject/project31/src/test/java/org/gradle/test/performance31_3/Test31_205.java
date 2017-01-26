package org.gradle.test.performance31_3;

import static org.junit.Assert.*;

public class Test31_205 {
    private final Production31_205 production = new Production31_205("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}