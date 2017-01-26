package org.gradle.test.performance37_5;

import static org.junit.Assert.*;

public class Test37_420 {
    private final Production37_420 production = new Production37_420("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}