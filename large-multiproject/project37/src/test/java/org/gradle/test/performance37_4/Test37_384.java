package org.gradle.test.performance37_4;

import static org.junit.Assert.*;

public class Test37_384 {
    private final Production37_384 production = new Production37_384("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}