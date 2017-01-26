package org.gradle.test.performance37_3;

import static org.junit.Assert.*;

public class Test37_250 {
    private final Production37_250 production = new Production37_250("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}