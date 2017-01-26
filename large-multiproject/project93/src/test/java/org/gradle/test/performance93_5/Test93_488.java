package org.gradle.test.performance93_5;

import static org.junit.Assert.*;

public class Test93_488 {
    private final Production93_488 production = new Production93_488("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}