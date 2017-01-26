package org.gradle.test.performance84_5;

import static org.junit.Assert.*;

public class Test84_415 {
    private final Production84_415 production = new Production84_415("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}