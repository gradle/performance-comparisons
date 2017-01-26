package org.gradle.test.performance37_4;

import static org.junit.Assert.*;

public class Test37_363 {
    private final Production37_363 production = new Production37_363("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}