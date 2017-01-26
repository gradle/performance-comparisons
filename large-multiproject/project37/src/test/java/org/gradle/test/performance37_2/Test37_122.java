package org.gradle.test.performance37_2;

import static org.junit.Assert.*;

public class Test37_122 {
    private final Production37_122 production = new Production37_122("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}