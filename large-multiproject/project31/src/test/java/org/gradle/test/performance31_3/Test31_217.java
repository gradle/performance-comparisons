package org.gradle.test.performance31_3;

import static org.junit.Assert.*;

public class Test31_217 {
    private final Production31_217 production = new Production31_217("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}