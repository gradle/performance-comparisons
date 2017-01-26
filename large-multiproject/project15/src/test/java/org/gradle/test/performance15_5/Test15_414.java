package org.gradle.test.performance15_5;

import static org.junit.Assert.*;

public class Test15_414 {
    private final Production15_414 production = new Production15_414("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}