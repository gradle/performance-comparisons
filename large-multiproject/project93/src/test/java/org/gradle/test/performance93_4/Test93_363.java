package org.gradle.test.performance93_4;

import static org.junit.Assert.*;

public class Test93_363 {
    private final Production93_363 production = new Production93_363("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}