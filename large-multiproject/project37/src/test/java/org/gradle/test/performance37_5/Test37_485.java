package org.gradle.test.performance37_5;

import static org.junit.Assert.*;

public class Test37_485 {
    private final Production37_485 production = new Production37_485("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}