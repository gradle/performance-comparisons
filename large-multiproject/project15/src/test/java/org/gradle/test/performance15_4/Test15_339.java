package org.gradle.test.performance15_4;

import static org.junit.Assert.*;

public class Test15_339 {
    private final Production15_339 production = new Production15_339("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}