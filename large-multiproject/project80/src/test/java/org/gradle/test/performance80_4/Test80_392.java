package org.gradle.test.performance80_4;

import static org.junit.Assert.*;

public class Test80_392 {
    private final Production80_392 production = new Production80_392("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}