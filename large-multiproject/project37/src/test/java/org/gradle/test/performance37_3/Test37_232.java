package org.gradle.test.performance37_3;

import static org.junit.Assert.*;

public class Test37_232 {
    private final Production37_232 production = new Production37_232("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}