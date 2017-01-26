package org.gradle.test.performance37_4;

import static org.junit.Assert.*;

public class Test37_371 {
    private final Production37_371 production = new Production37_371("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}