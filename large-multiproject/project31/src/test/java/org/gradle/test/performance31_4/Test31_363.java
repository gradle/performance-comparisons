package org.gradle.test.performance31_4;

import static org.junit.Assert.*;

public class Test31_363 {
    private final Production31_363 production = new Production31_363("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}