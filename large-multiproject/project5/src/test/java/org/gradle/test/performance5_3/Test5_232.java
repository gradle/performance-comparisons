package org.gradle.test.performance5_3;

import static org.junit.Assert.*;

public class Test5_232 {
    private final Production5_232 production = new Production5_232("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}