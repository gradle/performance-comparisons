package org.gradle.test.performance37_3;

import static org.junit.Assert.*;

public class Test37_252 {
    private final Production37_252 production = new Production37_252("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}