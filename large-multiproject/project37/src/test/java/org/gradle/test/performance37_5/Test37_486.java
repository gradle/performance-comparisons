package org.gradle.test.performance37_5;

import static org.junit.Assert.*;

public class Test37_486 {
    private final Production37_486 production = new Production37_486("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}