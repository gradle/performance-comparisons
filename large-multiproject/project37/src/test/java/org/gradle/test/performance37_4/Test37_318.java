package org.gradle.test.performance37_4;

import static org.junit.Assert.*;

public class Test37_318 {
    private final Production37_318 production = new Production37_318("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}