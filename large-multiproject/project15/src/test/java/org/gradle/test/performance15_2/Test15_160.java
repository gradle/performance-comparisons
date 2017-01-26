package org.gradle.test.performance15_2;

import static org.junit.Assert.*;

public class Test15_160 {
    private final Production15_160 production = new Production15_160("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}