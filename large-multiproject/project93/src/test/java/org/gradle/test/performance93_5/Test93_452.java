package org.gradle.test.performance93_5;

import static org.junit.Assert.*;

public class Test93_452 {
    private final Production93_452 production = new Production93_452("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}