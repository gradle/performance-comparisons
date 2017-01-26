package org.gradle.test.performance31_1;

import static org.junit.Assert.*;

public class Test31_16 {
    private final Production31_16 production = new Production31_16("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}