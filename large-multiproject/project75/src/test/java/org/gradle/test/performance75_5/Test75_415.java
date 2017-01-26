package org.gradle.test.performance75_5;

import static org.junit.Assert.*;

public class Test75_415 {
    private final Production75_415 production = new Production75_415("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}