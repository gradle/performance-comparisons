package org.gradle.test.performance5_1;

import static org.junit.Assert.*;

public class Test5_52 {
    private final Production5_52 production = new Production5_52("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}