package org.gradle.test.performance37_1;

import static org.junit.Assert.*;

public class Test37_18 {
    private final Production37_18 production = new Production37_18("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}