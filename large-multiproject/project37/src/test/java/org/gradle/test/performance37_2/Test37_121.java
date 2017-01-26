package org.gradle.test.performance37_2;

import static org.junit.Assert.*;

public class Test37_121 {
    private final Production37_121 production = new Production37_121("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}