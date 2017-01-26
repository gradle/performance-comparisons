package org.gradle.test.performance37_2;

import static org.junit.Assert.*;

public class Test37_129 {
    private final Production37_129 production = new Production37_129("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}