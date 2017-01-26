package org.gradle.test.performance37_4;

import static org.junit.Assert.*;

public class Test37_389 {
    private final Production37_389 production = new Production37_389("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}