package org.gradle.test.performance93_2;

import static org.junit.Assert.*;

public class Test93_176 {
    private final Production93_176 production = new Production93_176("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}