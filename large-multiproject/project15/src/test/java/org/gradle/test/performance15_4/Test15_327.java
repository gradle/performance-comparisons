package org.gradle.test.performance15_4;

import static org.junit.Assert.*;

public class Test15_327 {
    private final Production15_327 production = new Production15_327("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}