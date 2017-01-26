package org.gradle.test.performance24_4;

import static org.junit.Assert.*;

public class Test24_355 {
    private final Production24_355 production = new Production24_355("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}