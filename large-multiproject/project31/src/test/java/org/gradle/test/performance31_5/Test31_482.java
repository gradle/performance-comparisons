package org.gradle.test.performance31_5;

import static org.junit.Assert.*;

public class Test31_482 {
    private final Production31_482 production = new Production31_482("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}