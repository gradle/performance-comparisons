package org.gradle.test.performance93_5;

import static org.junit.Assert.*;

public class Test93_447 {
    private final Production93_447 production = new Production93_447("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}