package org.gradle.test.performance37_2;

import static org.junit.Assert.*;

public class Test37_179 {
    private final Production37_179 production = new Production37_179("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}