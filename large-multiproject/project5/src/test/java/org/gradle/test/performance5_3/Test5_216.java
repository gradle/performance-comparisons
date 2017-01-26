package org.gradle.test.performance5_3;

import static org.junit.Assert.*;

public class Test5_216 {
    private final Production5_216 production = new Production5_216("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}