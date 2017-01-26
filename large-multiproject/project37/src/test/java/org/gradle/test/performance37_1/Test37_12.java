package org.gradle.test.performance37_1;

import static org.junit.Assert.*;

public class Test37_12 {
    private final Production37_12 production = new Production37_12("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}