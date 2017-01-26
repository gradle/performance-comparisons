package org.gradle.test.performance24_5;

import static org.junit.Assert.*;

public class Test24_473 {
    private final Production24_473 production = new Production24_473("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}