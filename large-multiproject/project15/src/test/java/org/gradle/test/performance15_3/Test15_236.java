package org.gradle.test.performance15_3;

import static org.junit.Assert.*;

public class Test15_236 {
    private final Production15_236 production = new Production15_236("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}