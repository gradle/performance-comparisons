package org.gradle.test.performance37_4;

import static org.junit.Assert.*;

public class Test37_359 {
    private final Production37_359 production = new Production37_359("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}