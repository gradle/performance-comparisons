package org.gradle.test.performance37_2;

import static org.junit.Assert.*;

public class Test37_141 {
    private final Production37_141 production = new Production37_141("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}