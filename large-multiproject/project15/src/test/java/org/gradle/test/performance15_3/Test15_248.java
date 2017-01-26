package org.gradle.test.performance15_3;

import static org.junit.Assert.*;

public class Test15_248 {
    private final Production15_248 production = new Production15_248("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}