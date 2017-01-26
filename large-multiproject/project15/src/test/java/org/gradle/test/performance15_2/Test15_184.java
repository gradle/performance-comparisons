package org.gradle.test.performance15_2;

import static org.junit.Assert.*;

public class Test15_184 {
    private final Production15_184 production = new Production15_184("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}