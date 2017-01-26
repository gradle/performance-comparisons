package org.gradle.test.performance37_4;

import static org.junit.Assert.*;

public class Test37_381 {
    private final Production37_381 production = new Production37_381("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}