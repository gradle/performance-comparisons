package org.gradle.test.performance37_4;

import static org.junit.Assert.*;

public class Test37_348 {
    private final Production37_348 production = new Production37_348("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}