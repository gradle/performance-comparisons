package org.gradle.test.performance93_5;

import static org.junit.Assert.*;

public class Test93_469 {
    private final Production93_469 production = new Production93_469("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}