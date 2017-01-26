package org.gradle.test.performance37_1;

import static org.junit.Assert.*;

public class Test37_83 {
    private final Production37_83 production = new Production37_83("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}