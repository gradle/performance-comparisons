package org.gradle.test.performance37_3;

import static org.junit.Assert.*;

public class Test37_285 {
    private final Production37_285 production = new Production37_285("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}