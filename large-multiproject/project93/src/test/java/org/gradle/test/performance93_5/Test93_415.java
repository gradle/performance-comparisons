package org.gradle.test.performance93_5;

import static org.junit.Assert.*;

public class Test93_415 {
    private final Production93_415 production = new Production93_415("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}