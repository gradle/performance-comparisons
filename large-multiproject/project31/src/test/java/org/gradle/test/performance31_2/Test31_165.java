package org.gradle.test.performance31_2;

import static org.junit.Assert.*;

public class Test31_165 {
    private final Production31_165 production = new Production31_165("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}