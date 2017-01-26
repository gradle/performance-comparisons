package org.gradle.test.performance31_2;

import static org.junit.Assert.*;

public class Test31_152 {
    private final Production31_152 production = new Production31_152("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}