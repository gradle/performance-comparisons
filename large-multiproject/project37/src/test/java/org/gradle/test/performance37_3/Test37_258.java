package org.gradle.test.performance37_3;

import static org.junit.Assert.*;

public class Test37_258 {
    private final Production37_258 production = new Production37_258("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}