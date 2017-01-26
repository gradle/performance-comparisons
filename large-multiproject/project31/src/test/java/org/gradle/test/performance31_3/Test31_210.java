package org.gradle.test.performance31_3;

import static org.junit.Assert.*;

public class Test31_210 {
    private final Production31_210 production = new Production31_210("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}