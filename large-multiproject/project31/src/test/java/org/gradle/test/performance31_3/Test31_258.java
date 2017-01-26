package org.gradle.test.performance31_3;

import static org.junit.Assert.*;

public class Test31_258 {
    private final Production31_258 production = new Production31_258("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}