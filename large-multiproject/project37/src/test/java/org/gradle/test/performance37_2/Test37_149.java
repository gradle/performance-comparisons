package org.gradle.test.performance37_2;

import static org.junit.Assert.*;

public class Test37_149 {
    private final Production37_149 production = new Production37_149("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}