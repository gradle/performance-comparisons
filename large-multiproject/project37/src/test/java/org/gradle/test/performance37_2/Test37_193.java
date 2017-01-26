package org.gradle.test.performance37_2;

import static org.junit.Assert.*;

public class Test37_193 {
    private final Production37_193 production = new Production37_193("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}