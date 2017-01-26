package org.gradle.test.performance37_2;

import static org.junit.Assert.*;

public class Test37_158 {
    private final Production37_158 production = new Production37_158("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}