package org.gradle.test.performance37_2;

import static org.junit.Assert.*;

public class Test37_125 {
    private final Production37_125 production = new Production37_125("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}