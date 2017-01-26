package org.gradle.test.performance24_1;

import static org.junit.Assert.*;

public class Test24_24 {
    private final Production24_24 production = new Production24_24("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}