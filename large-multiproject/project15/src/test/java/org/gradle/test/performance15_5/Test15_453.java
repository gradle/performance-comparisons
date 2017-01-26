package org.gradle.test.performance15_5;

import static org.junit.Assert.*;

public class Test15_453 {
    private final Production15_453 production = new Production15_453("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}