package org.gradle.test.performance31_4;

import static org.junit.Assert.*;

public class Test31_317 {
    private final Production31_317 production = new Production31_317("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}