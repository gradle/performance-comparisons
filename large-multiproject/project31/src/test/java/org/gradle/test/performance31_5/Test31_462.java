package org.gradle.test.performance31_5;

import static org.junit.Assert.*;

public class Test31_462 {
    private final Production31_462 production = new Production31_462("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}