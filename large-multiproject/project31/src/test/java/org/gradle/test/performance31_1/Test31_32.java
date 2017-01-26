package org.gradle.test.performance31_1;

import static org.junit.Assert.*;

public class Test31_32 {
    private final Production31_32 production = new Production31_32("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}