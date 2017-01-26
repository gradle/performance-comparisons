package org.gradle.test.performance37_1;

import static org.junit.Assert.*;

public class Test37_32 {
    private final Production37_32 production = new Production37_32("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}