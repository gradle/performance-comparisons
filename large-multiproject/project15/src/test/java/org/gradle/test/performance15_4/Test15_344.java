package org.gradle.test.performance15_4;

import static org.junit.Assert.*;

public class Test15_344 {
    private final Production15_344 production = new Production15_344("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}