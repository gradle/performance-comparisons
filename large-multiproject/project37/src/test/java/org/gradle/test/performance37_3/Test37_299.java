package org.gradle.test.performance37_3;

import static org.junit.Assert.*;

public class Test37_299 {
    private final Production37_299 production = new Production37_299("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}