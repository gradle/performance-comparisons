package org.gradle.test.performance93_5;

import static org.junit.Assert.*;

public class Test93_492 {
    private final Production93_492 production = new Production93_492("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}