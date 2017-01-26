package org.gradle.test.performance31_5;

import static org.junit.Assert.*;

public class Test31_446 {
    private final Production31_446 production = new Production31_446("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}