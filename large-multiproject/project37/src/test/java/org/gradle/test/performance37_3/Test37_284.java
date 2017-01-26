package org.gradle.test.performance37_3;

import static org.junit.Assert.*;

public class Test37_284 {
    private final Production37_284 production = new Production37_284("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}