package org.gradle.test.performance37_1;

import static org.junit.Assert.*;

public class Test37_57 {
    private final Production37_57 production = new Production37_57("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}