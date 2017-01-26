package org.gradle.test.performance93_3;

import static org.junit.Assert.*;

public class Test93_244 {
    private final Production93_244 production = new Production93_244("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}