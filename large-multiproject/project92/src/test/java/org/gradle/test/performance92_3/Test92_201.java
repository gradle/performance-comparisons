package org.gradle.test.performance92_3;

import static org.junit.Assert.*;

public class Test92_201 {
    private final Production92_201 production = new Production92_201("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}