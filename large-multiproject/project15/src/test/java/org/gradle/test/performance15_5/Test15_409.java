package org.gradle.test.performance15_5;

import static org.junit.Assert.*;

public class Test15_409 {
    private final Production15_409 production = new Production15_409("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}