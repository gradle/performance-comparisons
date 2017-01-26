package org.gradle.test.performance37_4;

import static org.junit.Assert.*;

public class Test37_379 {
    private final Production37_379 production = new Production37_379("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}