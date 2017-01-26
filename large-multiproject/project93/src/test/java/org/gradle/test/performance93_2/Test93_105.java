package org.gradle.test.performance93_2;

import static org.junit.Assert.*;

public class Test93_105 {
    private final Production93_105 production = new Production93_105("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}