package org.gradle.test.performance37_4;

import static org.junit.Assert.*;

public class Test37_339 {
    private final Production37_339 production = new Production37_339("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}