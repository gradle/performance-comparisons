package org.gradle.test.performance37_2;

import static org.junit.Assert.*;

public class Test37_192 {
    private final Production37_192 production = new Production37_192("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}