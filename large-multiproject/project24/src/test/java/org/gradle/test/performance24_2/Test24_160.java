package org.gradle.test.performance24_2;

import static org.junit.Assert.*;

public class Test24_160 {
    private final Production24_160 production = new Production24_160("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}