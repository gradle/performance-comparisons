package org.gradle.test.performance24_4;

import static org.junit.Assert.*;

public class Test24_344 {
    private final Production24_344 production = new Production24_344("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}