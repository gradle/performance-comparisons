package org.gradle.test.performance15_2;

import static org.junit.Assert.*;

public class Test15_132 {
    private final Production15_132 production = new Production15_132("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}