package org.gradle.test.performance93_5;

import static org.junit.Assert.*;

public class Test93_468 {
    private final Production93_468 production = new Production93_468("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}