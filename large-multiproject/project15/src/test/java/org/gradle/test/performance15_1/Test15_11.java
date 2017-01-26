package org.gradle.test.performance15_1;

import static org.junit.Assert.*;

public class Test15_11 {
    private final Production15_11 production = new Production15_11("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}