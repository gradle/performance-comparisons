package org.gradle.test.performance31_2;

import static org.junit.Assert.*;

public class Test31_122 {
    private final Production31_122 production = new Production31_122("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}