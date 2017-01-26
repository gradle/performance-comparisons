package org.gradle.test.performance37_5;

import static org.junit.Assert.*;

public class Test37_438 {
    private final Production37_438 production = new Production37_438("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}