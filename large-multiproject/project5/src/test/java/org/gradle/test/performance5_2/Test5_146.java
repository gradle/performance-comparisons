package org.gradle.test.performance5_2;

import static org.junit.Assert.*;

public class Test5_146 {
    private final Production5_146 production = new Production5_146("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}