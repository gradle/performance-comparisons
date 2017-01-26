package org.gradle.test.performance89_5;

import static org.junit.Assert.*;

public class Test89_415 {
    private final Production89_415 production = new Production89_415("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}