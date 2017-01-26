package org.gradle.test.performance15_3;

import static org.junit.Assert.*;

public class Test15_201 {
    private final Production15_201 production = new Production15_201("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}