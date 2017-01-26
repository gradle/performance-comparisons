package org.gradle.test.performance15_5;

import static org.junit.Assert.*;

public class Test15_438 {
    private final Production15_438 production = new Production15_438("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}