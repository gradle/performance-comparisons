package org.gradle.test.performance37_5;

import static org.junit.Assert.*;

public class Test37_489 {
    private final Production37_489 production = new Production37_489("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}