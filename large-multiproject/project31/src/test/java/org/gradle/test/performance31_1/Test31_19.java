package org.gradle.test.performance31_1;

import static org.junit.Assert.*;

public class Test31_19 {
    private final Production31_19 production = new Production31_19("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}