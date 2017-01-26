package org.gradle.test.performance37_4;

import static org.junit.Assert.*;

public class Test37_370 {
    private final Production37_370 production = new Production37_370("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}