package org.gradle.test.performance37_1;

import static org.junit.Assert.*;

public class Test37_16 {
    private final Production37_16 production = new Production37_16("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}