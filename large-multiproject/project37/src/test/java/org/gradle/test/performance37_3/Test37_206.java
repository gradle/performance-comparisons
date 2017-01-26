package org.gradle.test.performance37_3;

import static org.junit.Assert.*;

public class Test37_206 {
    private final Production37_206 production = new Production37_206("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}