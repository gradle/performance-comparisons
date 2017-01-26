package org.gradle.test.performance15_2;

import static org.junit.Assert.*;

public class Test15_185 {
    private final Production15_185 production = new Production15_185("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}