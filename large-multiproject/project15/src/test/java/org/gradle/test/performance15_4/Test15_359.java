package org.gradle.test.performance15_4;

import static org.junit.Assert.*;

public class Test15_359 {
    private final Production15_359 production = new Production15_359("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}