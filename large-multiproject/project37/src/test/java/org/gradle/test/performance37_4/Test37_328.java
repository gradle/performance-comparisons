package org.gradle.test.performance37_4;

import static org.junit.Assert.*;

public class Test37_328 {
    private final Production37_328 production = new Production37_328("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}