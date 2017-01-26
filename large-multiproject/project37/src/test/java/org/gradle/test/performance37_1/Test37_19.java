package org.gradle.test.performance37_1;

import static org.junit.Assert.*;

public class Test37_19 {
    private final Production37_19 production = new Production37_19("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}