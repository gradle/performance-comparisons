package org.gradle.test.performance15_4;

import static org.junit.Assert.*;

public class Test15_368 {
    private final Production15_368 production = new Production15_368("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}