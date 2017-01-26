package org.gradle.test.performance37_4;

import static org.junit.Assert.*;

public class Test37_332 {
    private final Production37_332 production = new Production37_332("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}