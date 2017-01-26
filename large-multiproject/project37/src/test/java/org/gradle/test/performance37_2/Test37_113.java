package org.gradle.test.performance37_2;

import static org.junit.Assert.*;

public class Test37_113 {
    private final Production37_113 production = new Production37_113("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}