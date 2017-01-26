package org.gradle.test.performance37_4;

import static org.junit.Assert.*;

public class Test37_345 {
    private final Production37_345 production = new Production37_345("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}