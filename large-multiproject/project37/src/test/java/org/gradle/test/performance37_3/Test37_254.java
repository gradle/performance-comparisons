package org.gradle.test.performance37_3;

import static org.junit.Assert.*;

public class Test37_254 {
    private final Production37_254 production = new Production37_254("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}