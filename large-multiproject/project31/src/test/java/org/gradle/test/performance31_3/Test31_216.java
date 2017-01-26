package org.gradle.test.performance31_3;

import static org.junit.Assert.*;

public class Test31_216 {
    private final Production31_216 production = new Production31_216("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}