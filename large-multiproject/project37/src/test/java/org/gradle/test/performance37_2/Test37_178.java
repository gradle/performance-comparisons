package org.gradle.test.performance37_2;

import static org.junit.Assert.*;

public class Test37_178 {
    private final Production37_178 production = new Production37_178("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}