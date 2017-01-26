package org.gradle.test.performance37_4;

import static org.junit.Assert.*;

public class Test37_321 {
    private final Production37_321 production = new Production37_321("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}