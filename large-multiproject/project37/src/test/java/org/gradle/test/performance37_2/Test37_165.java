package org.gradle.test.performance37_2;

import static org.junit.Assert.*;

public class Test37_165 {
    private final Production37_165 production = new Production37_165("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}