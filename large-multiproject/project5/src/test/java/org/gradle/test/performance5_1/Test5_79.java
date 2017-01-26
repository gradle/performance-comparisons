package org.gradle.test.performance5_1;

import static org.junit.Assert.*;

public class Test5_79 {
    private final Production5_79 production = new Production5_79("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}