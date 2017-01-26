package org.gradle.test.performance37_1;

import static org.junit.Assert.*;

public class Test37_64 {
    private final Production37_64 production = new Production37_64("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}