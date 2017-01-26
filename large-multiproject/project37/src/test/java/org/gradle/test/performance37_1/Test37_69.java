package org.gradle.test.performance37_1;

import static org.junit.Assert.*;

public class Test37_69 {
    private final Production37_69 production = new Production37_69("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}