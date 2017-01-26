package org.gradle.test.performance31_1;

import static org.junit.Assert.*;

public class Test31_37 {
    private final Production31_37 production = new Production31_37("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}