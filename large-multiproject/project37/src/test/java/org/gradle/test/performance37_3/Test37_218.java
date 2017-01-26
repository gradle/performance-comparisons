package org.gradle.test.performance37_3;

import static org.junit.Assert.*;

public class Test37_218 {
    private final Production37_218 production = new Production37_218("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}