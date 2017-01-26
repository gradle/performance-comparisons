package org.gradle.test.performance37_5;

import static org.junit.Assert.*;

public class Test37_479 {
    private final Production37_479 production = new Production37_479("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}