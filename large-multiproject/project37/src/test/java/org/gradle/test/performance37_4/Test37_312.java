package org.gradle.test.performance37_4;

import static org.junit.Assert.*;

public class Test37_312 {
    private final Production37_312 production = new Production37_312("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}