package org.gradle.test.performance37_3;

import static org.junit.Assert.*;

public class Test37_217 {
    private final Production37_217 production = new Production37_217("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}