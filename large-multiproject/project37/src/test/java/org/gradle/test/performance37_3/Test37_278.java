package org.gradle.test.performance37_3;

import static org.junit.Assert.*;

public class Test37_278 {
    private final Production37_278 production = new Production37_278("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}