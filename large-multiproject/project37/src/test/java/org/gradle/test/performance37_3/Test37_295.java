package org.gradle.test.performance37_3;

import static org.junit.Assert.*;

public class Test37_295 {
    private final Production37_295 production = new Production37_295("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}