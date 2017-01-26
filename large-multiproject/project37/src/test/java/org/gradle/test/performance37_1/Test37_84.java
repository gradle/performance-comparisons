package org.gradle.test.performance37_1;

import static org.junit.Assert.*;

public class Test37_84 {
    private final Production37_84 production = new Production37_84("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}