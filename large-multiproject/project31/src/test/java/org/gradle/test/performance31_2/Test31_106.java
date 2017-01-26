package org.gradle.test.performance31_2;

import static org.junit.Assert.*;

public class Test31_106 {
    private final Production31_106 production = new Production31_106("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}