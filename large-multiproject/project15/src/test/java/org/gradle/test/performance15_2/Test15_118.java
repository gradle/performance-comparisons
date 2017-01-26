package org.gradle.test.performance15_2;

import static org.junit.Assert.*;

public class Test15_118 {
    private final Production15_118 production = new Production15_118("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}