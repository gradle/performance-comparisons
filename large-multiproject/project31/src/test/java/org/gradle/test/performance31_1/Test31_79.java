package org.gradle.test.performance31_1;

import static org.junit.Assert.*;

public class Test31_79 {
    private final Production31_79 production = new Production31_79("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}