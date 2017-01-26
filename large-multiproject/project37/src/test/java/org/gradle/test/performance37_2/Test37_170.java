package org.gradle.test.performance37_2;

import static org.junit.Assert.*;

public class Test37_170 {
    private final Production37_170 production = new Production37_170("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}