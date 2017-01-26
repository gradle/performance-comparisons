package org.gradle.test.performance5_5;

import static org.junit.Assert.*;

public class Test5_455 {
    private final Production5_455 production = new Production5_455("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}