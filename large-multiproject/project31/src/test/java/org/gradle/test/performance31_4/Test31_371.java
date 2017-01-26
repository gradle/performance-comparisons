package org.gradle.test.performance31_4;

import static org.junit.Assert.*;

public class Test31_371 {
    private final Production31_371 production = new Production31_371("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}