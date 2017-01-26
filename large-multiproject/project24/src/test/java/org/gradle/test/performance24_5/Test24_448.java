package org.gradle.test.performance24_5;

import static org.junit.Assert.*;

public class Test24_448 {
    private final Production24_448 production = new Production24_448("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}