package org.gradle.test.performance93_4;

import static org.junit.Assert.*;

public class Test93_334 {
    private final Production93_334 production = new Production93_334("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}