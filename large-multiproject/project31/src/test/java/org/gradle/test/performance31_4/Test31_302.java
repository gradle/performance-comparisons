package org.gradle.test.performance31_4;

import static org.junit.Assert.*;

public class Test31_302 {
    private final Production31_302 production = new Production31_302("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}