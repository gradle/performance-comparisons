package org.gradle.test.performance15_2;

import static org.junit.Assert.*;

public class Test15_120 {
    private final Production15_120 production = new Production15_120("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}