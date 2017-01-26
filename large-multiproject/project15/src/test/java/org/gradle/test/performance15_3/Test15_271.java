package org.gradle.test.performance15_3;

import static org.junit.Assert.*;

public class Test15_271 {
    private final Production15_271 production = new Production15_271("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}