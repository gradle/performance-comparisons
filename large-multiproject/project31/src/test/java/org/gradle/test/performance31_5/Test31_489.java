package org.gradle.test.performance31_5;

import static org.junit.Assert.*;

public class Test31_489 {
    private final Production31_489 production = new Production31_489("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}