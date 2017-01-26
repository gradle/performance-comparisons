package org.gradle.test.performance31_3;

import static org.junit.Assert.*;

public class Test31_252 {
    private final Production31_252 production = new Production31_252("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}