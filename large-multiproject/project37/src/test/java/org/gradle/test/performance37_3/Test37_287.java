package org.gradle.test.performance37_3;

import static org.junit.Assert.*;

public class Test37_287 {
    private final Production37_287 production = new Production37_287("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}