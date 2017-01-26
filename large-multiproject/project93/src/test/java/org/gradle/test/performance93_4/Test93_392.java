package org.gradle.test.performance93_4;

import static org.junit.Assert.*;

public class Test93_392 {
    private final Production93_392 production = new Production93_392("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}