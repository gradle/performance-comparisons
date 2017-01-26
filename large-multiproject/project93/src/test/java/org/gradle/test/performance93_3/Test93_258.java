package org.gradle.test.performance93_3;

import static org.junit.Assert.*;

public class Test93_258 {
    private final Production93_258 production = new Production93_258("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}