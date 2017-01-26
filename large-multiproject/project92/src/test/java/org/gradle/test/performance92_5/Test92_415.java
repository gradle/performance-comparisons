package org.gradle.test.performance92_5;

import static org.junit.Assert.*;

public class Test92_415 {
    private final Production92_415 production = new Production92_415("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}