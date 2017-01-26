package org.gradle.test.performance5_2;

import static org.junit.Assert.*;

public class Test5_193 {
    private final Production5_193 production = new Production5_193("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}