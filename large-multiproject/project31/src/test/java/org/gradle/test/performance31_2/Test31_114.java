package org.gradle.test.performance31_2;

import static org.junit.Assert.*;

public class Test31_114 {
    private final Production31_114 production = new Production31_114("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}