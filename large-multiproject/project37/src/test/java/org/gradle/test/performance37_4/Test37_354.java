package org.gradle.test.performance37_4;

import static org.junit.Assert.*;

public class Test37_354 {
    private final Production37_354 production = new Production37_354("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}