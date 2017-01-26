package org.gradle.test.performance5_5;

import static org.junit.Assert.*;

public class Test5_441 {
    private final Production5_441 production = new Production5_441("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}