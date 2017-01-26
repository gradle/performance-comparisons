package org.gradle.test.performance15_4;

import static org.junit.Assert.*;

public class Test15_349 {
    private final Production15_349 production = new Production15_349("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}