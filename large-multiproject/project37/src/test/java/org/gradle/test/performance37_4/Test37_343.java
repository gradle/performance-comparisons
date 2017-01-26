package org.gradle.test.performance37_4;

import static org.junit.Assert.*;

public class Test37_343 {
    private final Production37_343 production = new Production37_343("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}