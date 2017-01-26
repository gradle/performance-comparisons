package org.gradle.test.performance92_2;

import static org.junit.Assert.*;

public class Test92_170 {
    private final Production92_170 production = new Production92_170("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}