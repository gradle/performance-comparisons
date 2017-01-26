package org.gradle.test.performance37_3;

import static org.junit.Assert.*;

public class Test37_283 {
    private final Production37_283 production = new Production37_283("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}