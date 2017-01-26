package org.gradle.test.performance31_4;

import static org.junit.Assert.*;

public class Test31_348 {
    private final Production31_348 production = new Production31_348("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}