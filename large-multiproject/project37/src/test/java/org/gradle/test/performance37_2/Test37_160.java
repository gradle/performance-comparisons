package org.gradle.test.performance37_2;

import static org.junit.Assert.*;

public class Test37_160 {
    private final Production37_160 production = new Production37_160("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}