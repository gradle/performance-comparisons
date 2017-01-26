package org.gradle.test.performance37_4;

import static org.junit.Assert.*;

public class Test37_334 {
    private final Production37_334 production = new Production37_334("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}