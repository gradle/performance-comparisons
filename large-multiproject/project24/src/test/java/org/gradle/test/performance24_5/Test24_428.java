package org.gradle.test.performance24_5;

import static org.junit.Assert.*;

public class Test24_428 {
    private final Production24_428 production = new Production24_428("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}