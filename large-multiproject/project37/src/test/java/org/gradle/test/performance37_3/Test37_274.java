package org.gradle.test.performance37_3;

import static org.junit.Assert.*;

public class Test37_274 {
    private final Production37_274 production = new Production37_274("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}