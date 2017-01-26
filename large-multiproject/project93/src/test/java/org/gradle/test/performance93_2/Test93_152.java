package org.gradle.test.performance93_2;

import static org.junit.Assert.*;

public class Test93_152 {
    private final Production93_152 production = new Production93_152("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}