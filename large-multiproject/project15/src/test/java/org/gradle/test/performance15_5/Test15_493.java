package org.gradle.test.performance15_5;

import static org.junit.Assert.*;

public class Test15_493 {
    private final Production15_493 production = new Production15_493("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}