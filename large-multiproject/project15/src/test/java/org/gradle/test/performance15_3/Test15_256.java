package org.gradle.test.performance15_3;

import static org.junit.Assert.*;

public class Test15_256 {
    private final Production15_256 production = new Production15_256("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}