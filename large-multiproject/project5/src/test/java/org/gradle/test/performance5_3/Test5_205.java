package org.gradle.test.performance5_3;

import static org.junit.Assert.*;

public class Test5_205 {
    private final Production5_205 production = new Production5_205("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}