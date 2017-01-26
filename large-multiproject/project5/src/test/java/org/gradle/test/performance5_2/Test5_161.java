package org.gradle.test.performance5_2;

import static org.junit.Assert.*;

public class Test5_161 {
    private final Production5_161 production = new Production5_161("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}