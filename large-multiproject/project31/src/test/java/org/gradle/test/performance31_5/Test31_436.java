package org.gradle.test.performance31_5;

import static org.junit.Assert.*;

public class Test31_436 {
    private final Production31_436 production = new Production31_436("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}