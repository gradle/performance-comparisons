package org.gradle.test.performance37_1;

import static org.junit.Assert.*;

public class Test37_22 {
    private final Production37_22 production = new Production37_22("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}