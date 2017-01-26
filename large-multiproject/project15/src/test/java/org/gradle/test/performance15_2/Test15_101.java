package org.gradle.test.performance15_2;

import static org.junit.Assert.*;

public class Test15_101 {
    private final Production15_101 production = new Production15_101("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}