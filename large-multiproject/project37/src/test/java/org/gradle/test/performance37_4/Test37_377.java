package org.gradle.test.performance37_4;

import static org.junit.Assert.*;

public class Test37_377 {
    private final Production37_377 production = new Production37_377("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}