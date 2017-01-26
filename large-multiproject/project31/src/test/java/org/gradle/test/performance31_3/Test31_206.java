package org.gradle.test.performance31_3;

import static org.junit.Assert.*;

public class Test31_206 {
    private final Production31_206 production = new Production31_206("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}