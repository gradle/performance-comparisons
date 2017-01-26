package org.gradle.test.performance31_4;

import static org.junit.Assert.*;

public class Test31_343 {
    private final Production31_343 production = new Production31_343("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}