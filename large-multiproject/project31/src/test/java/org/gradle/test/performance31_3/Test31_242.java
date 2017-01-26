package org.gradle.test.performance31_3;

import static org.junit.Assert.*;

public class Test31_242 {
    private final Production31_242 production = new Production31_242("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}