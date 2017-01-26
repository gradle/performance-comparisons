package org.gradle.test.performance31_3;

import static org.junit.Assert.*;

public class Test31_265 {
    private final Production31_265 production = new Production31_265("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}