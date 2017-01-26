package org.gradle.test.performance93_4;

import static org.junit.Assert.*;

public class Test93_313 {
    private final Production93_313 production = new Production93_313("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}