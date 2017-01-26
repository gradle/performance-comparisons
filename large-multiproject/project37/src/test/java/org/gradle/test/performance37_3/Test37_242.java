package org.gradle.test.performance37_3;

import static org.junit.Assert.*;

public class Test37_242 {
    private final Production37_242 production = new Production37_242("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}