package org.gradle.test.performance37_4;

import static org.junit.Assert.*;

public class Test37_340 {
    private final Production37_340 production = new Production37_340("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}