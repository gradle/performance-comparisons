package org.gradle.test.performance37_2;

import static org.junit.Assert.*;

public class Test37_103 {
    private final Production37_103 production = new Production37_103("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}