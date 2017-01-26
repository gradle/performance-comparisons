package org.gradle.test.performance31_2;

import static org.junit.Assert.*;

public class Test31_148 {
    private final Production31_148 production = new Production31_148("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}