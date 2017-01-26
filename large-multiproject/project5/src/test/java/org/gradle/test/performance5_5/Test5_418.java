package org.gradle.test.performance5_5;

import static org.junit.Assert.*;

public class Test5_418 {
    private final Production5_418 production = new Production5_418("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}