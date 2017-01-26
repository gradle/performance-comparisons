package org.gradle.test.performance37_4;

import static org.junit.Assert.*;

public class Test37_355 {
    private final Production37_355 production = new Production37_355("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}