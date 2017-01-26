package org.gradle.test.performance37_5;

import static org.junit.Assert.*;

public class Test37_484 {
    private final Production37_484 production = new Production37_484("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}