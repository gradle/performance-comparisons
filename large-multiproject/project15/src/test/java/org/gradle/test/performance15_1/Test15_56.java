package org.gradle.test.performance15_1;

import static org.junit.Assert.*;

public class Test15_56 {
    private final Production15_56 production = new Production15_56("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}