package org.gradle.test.performance37_5;

import static org.junit.Assert.*;

public class Test37_462 {
    private final Production37_462 production = new Production37_462("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}