package org.gradle.test.performance31_2;

import static org.junit.Assert.*;

public class Test31_142 {
    private final Production31_142 production = new Production31_142("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}