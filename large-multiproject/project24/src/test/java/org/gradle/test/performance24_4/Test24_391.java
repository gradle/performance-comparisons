package org.gradle.test.performance24_4;

import static org.junit.Assert.*;

public class Test24_391 {
    private final Production24_391 production = new Production24_391("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}