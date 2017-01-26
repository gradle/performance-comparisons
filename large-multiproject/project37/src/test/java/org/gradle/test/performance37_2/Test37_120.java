package org.gradle.test.performance37_2;

import static org.junit.Assert.*;

public class Test37_120 {
    private final Production37_120 production = new Production37_120("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}