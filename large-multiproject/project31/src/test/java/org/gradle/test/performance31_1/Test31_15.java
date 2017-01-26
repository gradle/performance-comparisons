package org.gradle.test.performance31_1;

import static org.junit.Assert.*;

public class Test31_15 {
    private final Production31_15 production = new Production31_15("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}