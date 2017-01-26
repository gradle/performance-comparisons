package org.gradle.test.performance15_5;

import static org.junit.Assert.*;

public class Test15_490 {
    private final Production15_490 production = new Production15_490("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}