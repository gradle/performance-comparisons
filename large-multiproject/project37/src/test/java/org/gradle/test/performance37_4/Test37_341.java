package org.gradle.test.performance37_4;

import static org.junit.Assert.*;

public class Test37_341 {
    private final Production37_341 production = new Production37_341("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}