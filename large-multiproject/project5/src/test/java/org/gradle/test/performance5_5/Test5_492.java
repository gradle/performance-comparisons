package org.gradle.test.performance5_5;

import static org.junit.Assert.*;

public class Test5_492 {
    private final Production5_492 production = new Production5_492("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}