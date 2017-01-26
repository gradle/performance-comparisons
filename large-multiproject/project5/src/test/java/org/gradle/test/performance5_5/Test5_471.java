package org.gradle.test.performance5_5;

import static org.junit.Assert.*;

public class Test5_471 {
    private final Production5_471 production = new Production5_471("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}