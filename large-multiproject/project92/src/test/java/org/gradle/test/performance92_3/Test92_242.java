package org.gradle.test.performance92_3;

import static org.junit.Assert.*;

public class Test92_242 {
    private final Production92_242 production = new Production92_242("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}