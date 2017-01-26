package org.gradle.test.performance37_2;

import static org.junit.Assert.*;

public class Test37_131 {
    private final Production37_131 production = new Production37_131("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}