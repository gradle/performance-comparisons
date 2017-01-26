package org.gradle.test.performance37_3;

import static org.junit.Assert.*;

public class Test37_261 {
    private final Production37_261 production = new Production37_261("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}