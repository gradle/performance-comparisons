package org.gradle.test.performance93_5;

import static org.junit.Assert.*;

public class Test93_462 {
    private final Production93_462 production = new Production93_462("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}