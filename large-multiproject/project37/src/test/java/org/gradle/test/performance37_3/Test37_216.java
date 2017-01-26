package org.gradle.test.performance37_3;

import static org.junit.Assert.*;

public class Test37_216 {
    private final Production37_216 production = new Production37_216("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}