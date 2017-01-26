package org.gradle.test.performance37_4;

import static org.junit.Assert.*;

public class Test37_396 {
    private final Production37_396 production = new Production37_396("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}