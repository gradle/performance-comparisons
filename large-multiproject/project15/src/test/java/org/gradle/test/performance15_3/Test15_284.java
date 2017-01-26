package org.gradle.test.performance15_3;

import static org.junit.Assert.*;

public class Test15_284 {
    private final Production15_284 production = new Production15_284("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}