package org.gradle.test.performance15_2;

import static org.junit.Assert.*;

public class Test15_116 {
    private final Production15_116 production = new Production15_116("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}