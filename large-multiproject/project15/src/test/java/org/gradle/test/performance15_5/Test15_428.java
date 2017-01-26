package org.gradle.test.performance15_5;

import static org.junit.Assert.*;

public class Test15_428 {
    private final Production15_428 production = new Production15_428("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}