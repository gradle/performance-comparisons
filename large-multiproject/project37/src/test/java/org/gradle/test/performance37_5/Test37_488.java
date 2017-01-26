package org.gradle.test.performance37_5;

import static org.junit.Assert.*;

public class Test37_488 {
    private final Production37_488 production = new Production37_488("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}