package org.gradle.test.performance15_4;

import static org.junit.Assert.*;

public class Test15_301 {
    private final Production15_301 production = new Production15_301("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}