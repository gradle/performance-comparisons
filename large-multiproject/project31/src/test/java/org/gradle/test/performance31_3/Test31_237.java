package org.gradle.test.performance31_3;

import static org.junit.Assert.*;

public class Test31_237 {
    private final Production31_237 production = new Production31_237("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}