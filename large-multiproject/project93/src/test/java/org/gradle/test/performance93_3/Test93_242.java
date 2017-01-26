package org.gradle.test.performance93_3;

import static org.junit.Assert.*;

public class Test93_242 {
    private final Production93_242 production = new Production93_242("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}