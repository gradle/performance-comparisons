package org.gradle.test.performance31_3;

import static org.junit.Assert.*;

public class Test31_203 {
    private final Production31_203 production = new Production31_203("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}