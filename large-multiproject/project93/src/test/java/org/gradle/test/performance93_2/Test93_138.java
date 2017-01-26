package org.gradle.test.performance93_2;

import static org.junit.Assert.*;

public class Test93_138 {
    private final Production93_138 production = new Production93_138("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}