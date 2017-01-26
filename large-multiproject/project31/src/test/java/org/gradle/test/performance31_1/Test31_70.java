package org.gradle.test.performance31_1;

import static org.junit.Assert.*;

public class Test31_70 {
    private final Production31_70 production = new Production31_70("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}