package org.gradle.test.performance31_4;

import static org.junit.Assert.*;

public class Test31_384 {
    private final Production31_384 production = new Production31_384("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}