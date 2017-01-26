package org.gradle.test.performance24_5;

import static org.junit.Assert.*;

public class Test24_409 {
    private final Production24_409 production = new Production24_409("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}