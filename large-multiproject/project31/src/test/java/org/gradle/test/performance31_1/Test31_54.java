package org.gradle.test.performance31_1;

import static org.junit.Assert.*;

public class Test31_54 {
    private final Production31_54 production = new Production31_54("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}