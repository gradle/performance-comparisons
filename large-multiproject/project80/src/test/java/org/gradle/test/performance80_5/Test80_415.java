package org.gradle.test.performance80_5;

import static org.junit.Assert.*;

public class Test80_415 {
    private final Production80_415 production = new Production80_415("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}