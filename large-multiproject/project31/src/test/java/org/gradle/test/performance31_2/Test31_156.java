package org.gradle.test.performance31_2;

import static org.junit.Assert.*;

public class Test31_156 {
    private final Production31_156 production = new Production31_156("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}