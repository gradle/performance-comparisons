package org.gradle.test.performance4_5;

import static org.junit.Assert.*;

public class Test4_415 {
    private final Production4_415 production = new Production4_415("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}