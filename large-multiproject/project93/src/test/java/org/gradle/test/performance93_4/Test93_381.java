package org.gradle.test.performance93_4;

import static org.junit.Assert.*;

public class Test93_381 {
    private final Production93_381 production = new Production93_381("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}