package org.gradle.test.performance31_5;

import static org.junit.Assert.*;

public class Test31_488 {
    private final Production31_488 production = new Production31_488("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}