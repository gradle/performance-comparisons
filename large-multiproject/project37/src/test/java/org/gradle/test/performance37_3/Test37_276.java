package org.gradle.test.performance37_3;

import static org.junit.Assert.*;

public class Test37_276 {
    private final Production37_276 production = new Production37_276("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}