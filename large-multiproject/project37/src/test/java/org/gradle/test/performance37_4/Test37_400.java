package org.gradle.test.performance37_4;

import static org.junit.Assert.*;

public class Test37_400 {
    private final Production37_400 production = new Production37_400("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}