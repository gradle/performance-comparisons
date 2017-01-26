package org.gradle.test.performance31_1;

import static org.junit.Assert.*;

public class Test31_74 {
    private final Production31_74 production = new Production31_74("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}