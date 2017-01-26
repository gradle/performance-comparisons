package org.gradle.test.performance37_2;

import static org.junit.Assert.*;

public class Test37_190 {
    private final Production37_190 production = new Production37_190("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}