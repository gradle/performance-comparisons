package org.gradle.test.performance93_2;

import static org.junit.Assert.*;

public class Test93_170 {
    private final Production93_170 production = new Production93_170("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}