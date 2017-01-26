package org.gradle.test.performance31_2;

import static org.junit.Assert.*;

public class Test31_140 {
    private final Production31_140 production = new Production31_140("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}