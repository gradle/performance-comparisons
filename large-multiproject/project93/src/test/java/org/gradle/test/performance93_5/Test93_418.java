package org.gradle.test.performance93_5;

import static org.junit.Assert.*;

public class Test93_418 {
    private final Production93_418 production = new Production93_418("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}