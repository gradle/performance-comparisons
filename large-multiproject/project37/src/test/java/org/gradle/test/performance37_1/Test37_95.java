package org.gradle.test.performance37_1;

import static org.junit.Assert.*;

public class Test37_95 {
    private final Production37_95 production = new Production37_95("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}