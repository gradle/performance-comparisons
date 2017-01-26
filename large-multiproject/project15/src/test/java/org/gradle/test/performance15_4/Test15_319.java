package org.gradle.test.performance15_4;

import static org.junit.Assert.*;

public class Test15_319 {
    private final Production15_319 production = new Production15_319("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}