package org.gradle.test.performance15_5;

import static org.junit.Assert.*;

public class Test15_436 {
    private final Production15_436 production = new Production15_436("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}