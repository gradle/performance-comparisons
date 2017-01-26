package org.gradle.test.performance31_4;

import static org.junit.Assert.*;

public class Test31_357 {
    private final Production31_357 production = new Production31_357("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}