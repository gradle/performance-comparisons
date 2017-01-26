package org.gradle.test.performance37_5;

import static org.junit.Assert.*;

public class Test37_467 {
    private final Production37_467 production = new Production37_467("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}