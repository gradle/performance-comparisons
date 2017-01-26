package org.gradle.test.performance5_5;

import static org.junit.Assert.*;

public class Test5_415 {
    private final Production5_415 production = new Production5_415("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}