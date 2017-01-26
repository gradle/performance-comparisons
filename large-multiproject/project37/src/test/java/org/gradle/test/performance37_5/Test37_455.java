package org.gradle.test.performance37_5;

import static org.junit.Assert.*;

public class Test37_455 {
    private final Production37_455 production = new Production37_455("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}