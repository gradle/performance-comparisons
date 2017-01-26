package org.gradle.test.performance37_5;

import static org.junit.Assert.*;

public class Test37_412 {
    private final Production37_412 production = new Production37_412("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}