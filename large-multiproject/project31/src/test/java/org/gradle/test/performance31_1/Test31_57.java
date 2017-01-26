package org.gradle.test.performance31_1;

import static org.junit.Assert.*;

public class Test31_57 {
    private final Production31_57 production = new Production31_57("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}