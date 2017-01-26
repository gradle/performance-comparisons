package org.gradle.test.performance31_1;

import static org.junit.Assert.*;

public class Test31_33 {
    private final Production31_33 production = new Production31_33("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}