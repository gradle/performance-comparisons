package org.gradle.test.performance37_2;

import static org.junit.Assert.*;

public class Test37_108 {
    private final Production37_108 production = new Production37_108("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}