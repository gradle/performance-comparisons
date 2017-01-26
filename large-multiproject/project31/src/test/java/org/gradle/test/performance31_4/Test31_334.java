package org.gradle.test.performance31_4;

import static org.junit.Assert.*;

public class Test31_334 {
    private final Production31_334 production = new Production31_334("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}