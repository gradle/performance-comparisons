package org.gradle.test.performance93_2;

import static org.junit.Assert.*;

public class Test93_160 {
    private final Production93_160 production = new Production93_160("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}