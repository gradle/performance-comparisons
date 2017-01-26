package org.gradle.test.performance37_5;

import static org.junit.Assert.*;

public class Test37_410 {
    private final Production37_410 production = new Production37_410("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}