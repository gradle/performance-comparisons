package org.gradle.test.performance93_4;

import static org.junit.Assert.*;

public class Test93_304 {
    private final Production93_304 production = new Production93_304("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}