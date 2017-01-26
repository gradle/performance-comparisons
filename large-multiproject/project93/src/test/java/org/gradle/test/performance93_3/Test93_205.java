package org.gradle.test.performance93_3;

import static org.junit.Assert.*;

public class Test93_205 {
    private final Production93_205 production = new Production93_205("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}