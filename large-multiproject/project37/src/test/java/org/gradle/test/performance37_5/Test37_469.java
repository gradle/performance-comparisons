package org.gradle.test.performance37_5;

import static org.junit.Assert.*;

public class Test37_469 {
    private final Production37_469 production = new Production37_469("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}