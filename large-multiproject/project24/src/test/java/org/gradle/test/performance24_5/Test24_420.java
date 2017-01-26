package org.gradle.test.performance24_5;

import static org.junit.Assert.*;

public class Test24_420 {
    private final Production24_420 production = new Production24_420("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}