package org.gradle.test.performance93_2;

import static org.junit.Assert.*;

public class Test93_126 {
    private final Production93_126 production = new Production93_126("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}