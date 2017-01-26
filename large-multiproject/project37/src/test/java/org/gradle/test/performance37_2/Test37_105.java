package org.gradle.test.performance37_2;

import static org.junit.Assert.*;

public class Test37_105 {
    private final Production37_105 production = new Production37_105("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}