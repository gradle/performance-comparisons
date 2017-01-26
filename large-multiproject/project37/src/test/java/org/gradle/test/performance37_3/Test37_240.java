package org.gradle.test.performance37_3;

import static org.junit.Assert.*;

public class Test37_240 {
    private final Production37_240 production = new Production37_240("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}