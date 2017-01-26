package org.gradle.test.performance37_5;

import static org.junit.Assert.*;

public class Test37_436 {
    private final Production37_436 production = new Production37_436("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}