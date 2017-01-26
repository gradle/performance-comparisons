package org.gradle.test.performance37_3;

import static org.junit.Assert.*;

public class Test37_298 {
    private final Production37_298 production = new Production37_298("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}