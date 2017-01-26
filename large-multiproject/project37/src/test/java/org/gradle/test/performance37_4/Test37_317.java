package org.gradle.test.performance37_4;

import static org.junit.Assert.*;

public class Test37_317 {
    private final Production37_317 production = new Production37_317("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}