package org.gradle.test.performance37_5;

import static org.junit.Assert.*;

public class Test37_405 {
    private final Production37_405 production = new Production37_405("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}