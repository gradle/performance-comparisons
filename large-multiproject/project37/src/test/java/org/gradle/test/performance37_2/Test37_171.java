package org.gradle.test.performance37_2;

import static org.junit.Assert.*;

public class Test37_171 {
    private final Production37_171 production = new Production37_171("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}