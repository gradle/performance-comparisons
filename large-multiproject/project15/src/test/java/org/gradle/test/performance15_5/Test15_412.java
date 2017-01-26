package org.gradle.test.performance15_5;

import static org.junit.Assert.*;

public class Test15_412 {
    private final Production15_412 production = new Production15_412("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}