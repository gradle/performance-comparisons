package org.gradle.test.performance15_5;

import static org.junit.Assert.*;

public class Test15_413 {
    private final Production15_413 production = new Production15_413("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}