package org.gradle.test.performance37_1;

import static org.junit.Assert.*;

public class Test37_94 {
    private final Production37_94 production = new Production37_94("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}