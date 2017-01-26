package org.gradle.test.performance24_1;

import static org.junit.Assert.*;

public class Test24_11 {
    private final Production24_11 production = new Production24_11("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}