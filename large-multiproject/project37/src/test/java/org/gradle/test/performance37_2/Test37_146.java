package org.gradle.test.performance37_2;

import static org.junit.Assert.*;

public class Test37_146 {
    private final Production37_146 production = new Production37_146("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}