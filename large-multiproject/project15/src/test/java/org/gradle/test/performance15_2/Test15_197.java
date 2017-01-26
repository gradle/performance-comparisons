package org.gradle.test.performance15_2;

import static org.junit.Assert.*;

public class Test15_197 {
    private final Production15_197 production = new Production15_197("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}