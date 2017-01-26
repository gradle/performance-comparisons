package org.gradle.test.performance31_4;

import static org.junit.Assert.*;

public class Test31_304 {
    private final Production31_304 production = new Production31_304("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}