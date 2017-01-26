package org.gradle.test.performance31_3;

import static org.junit.Assert.*;

public class Test31_249 {
    private final Production31_249 production = new Production31_249("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}