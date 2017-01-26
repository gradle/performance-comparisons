package org.gradle.test.performance5_3;

import static org.junit.Assert.*;

public class Test5_217 {
    private final Production5_217 production = new Production5_217("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}