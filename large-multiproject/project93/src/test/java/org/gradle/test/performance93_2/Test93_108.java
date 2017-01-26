package org.gradle.test.performance93_2;

import static org.junit.Assert.*;

public class Test93_108 {
    private final Production93_108 production = new Production93_108("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}