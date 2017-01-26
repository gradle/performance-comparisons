package org.gradle.test.performance37_4;

import static org.junit.Assert.*;

public class Test37_342 {
    private final Production37_342 production = new Production37_342("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}