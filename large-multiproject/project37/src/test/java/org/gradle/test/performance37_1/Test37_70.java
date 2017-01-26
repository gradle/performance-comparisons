package org.gradle.test.performance37_1;

import static org.junit.Assert.*;

public class Test37_70 {
    private final Production37_70 production = new Production37_70("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}