package org.gradle.test.performance37_5;

import static org.junit.Assert.*;

public class Test37_452 {
    private final Production37_452 production = new Production37_452("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}