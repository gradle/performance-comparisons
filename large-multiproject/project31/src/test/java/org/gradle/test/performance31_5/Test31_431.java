package org.gradle.test.performance31_5;

import static org.junit.Assert.*;

public class Test31_431 {
    private final Production31_431 production = new Production31_431("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}