package org.gradle.test.performance93_2;

import static org.junit.Assert.*;

public class Test93_158 {
    private final Production93_158 production = new Production93_158("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}