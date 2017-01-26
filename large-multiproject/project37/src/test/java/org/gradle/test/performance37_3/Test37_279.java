package org.gradle.test.performance37_3;

import static org.junit.Assert.*;

public class Test37_279 {
    private final Production37_279 production = new Production37_279("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}