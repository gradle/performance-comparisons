package org.gradle.test.performance31_2;

import static org.junit.Assert.*;

public class Test31_181 {
    private final Production31_181 production = new Production31_181("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}