package org.gradle.test.performance5_5;

import static org.junit.Assert.*;

public class Test5_485 {
    private final Production5_485 production = new Production5_485("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}