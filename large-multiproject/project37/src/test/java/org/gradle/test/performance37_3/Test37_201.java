package org.gradle.test.performance37_3;

import static org.junit.Assert.*;

public class Test37_201 {
    private final Production37_201 production = new Production37_201("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}