package org.gradle.test.performance24_5;

import static org.junit.Assert.*;

public class Test24_412 {
    private final Production24_412 production = new Production24_412("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}