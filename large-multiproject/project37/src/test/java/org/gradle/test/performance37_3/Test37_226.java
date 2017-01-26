package org.gradle.test.performance37_3;

import static org.junit.Assert.*;

public class Test37_226 {
    private final Production37_226 production = new Production37_226("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}