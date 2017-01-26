package org.gradle.test.performance5_4;

import static org.junit.Assert.*;

public class Test5_339 {
    private final Production5_339 production = new Production5_339("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}