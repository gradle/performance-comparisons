package org.gradle.test.performance37_1;

import static org.junit.Assert.*;

public class Test37_24 {
    private final Production37_24 production = new Production37_24("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}