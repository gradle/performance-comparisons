package org.gradle.test.performance37_4;

import static org.junit.Assert.*;

public class Test37_302 {
    private final Production37_302 production = new Production37_302("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}