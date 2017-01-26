package org.gradle.test.performance37_3;

import static org.junit.Assert.*;

public class Test37_237 {
    private final Production37_237 production = new Production37_237("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}