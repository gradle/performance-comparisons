package org.gradle.test.performance5_3;

import static org.junit.Assert.*;

public class Test5_203 {
    private final Production5_203 production = new Production5_203("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}