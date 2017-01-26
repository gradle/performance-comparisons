package org.gradle.test.performance26_1;

import static org.junit.Assert.*;

public class Test26_56 {
    private final Production26_56 production = new Production26_56("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}