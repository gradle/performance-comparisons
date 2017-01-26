package org.gradle.test.performance37_4;

import static org.junit.Assert.*;

public class Test37_311 {
    private final Production37_311 production = new Production37_311("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}