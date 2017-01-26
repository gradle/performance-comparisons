package org.gradle.test.performance15_3;

import static org.junit.Assert.*;

public class Test15_299 {
    private final Production15_299 production = new Production15_299("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}