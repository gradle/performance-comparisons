package org.gradle.test.performance15_3;

import static org.junit.Assert.*;

public class Test15_295 {
    private final Production15_295 production = new Production15_295("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}