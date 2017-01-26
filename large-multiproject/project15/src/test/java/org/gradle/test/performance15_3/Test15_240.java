package org.gradle.test.performance15_3;

import static org.junit.Assert.*;

public class Test15_240 {
    private final Production15_240 production = new Production15_240("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}