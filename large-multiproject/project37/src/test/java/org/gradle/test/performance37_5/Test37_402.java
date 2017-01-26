package org.gradle.test.performance37_5;

import static org.junit.Assert.*;

public class Test37_402 {
    private final Production37_402 production = new Production37_402("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}