package org.gradle.test.performance31_2;

import static org.junit.Assert.*;

public class Test31_136 {
    private final Production31_136 production = new Production31_136("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}