package org.gradle.test.performance37_3;

import static org.junit.Assert.*;

public class Test37_271 {
    private final Production37_271 production = new Production37_271("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}