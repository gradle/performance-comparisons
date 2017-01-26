package org.gradle.test.performance92_2;

import static org.junit.Assert.*;

public class Test92_158 {
    private final Production92_158 production = new Production92_158("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}