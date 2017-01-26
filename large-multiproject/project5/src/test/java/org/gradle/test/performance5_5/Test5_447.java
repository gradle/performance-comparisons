package org.gradle.test.performance5_5;

import static org.junit.Assert.*;

public class Test5_447 {
    private final Production5_447 production = new Production5_447("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}