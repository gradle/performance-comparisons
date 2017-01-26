package org.gradle.test.performance5_4;

import static org.junit.Assert.*;

public class Test5_329 {
    private final Production5_329 production = new Production5_329("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}