package org.gradle.test.performance15_4;

import static org.junit.Assert.*;

public class Test15_332 {
    private final Production15_332 production = new Production15_332("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}