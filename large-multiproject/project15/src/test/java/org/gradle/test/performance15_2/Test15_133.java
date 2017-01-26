package org.gradle.test.performance15_2;

import static org.junit.Assert.*;

public class Test15_133 {
    private final Production15_133 production = new Production15_133("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}