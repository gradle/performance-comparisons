package org.gradle.test.performance37_4;

import static org.junit.Assert.*;

public class Test37_349 {
    private final Production37_349 production = new Production37_349("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}