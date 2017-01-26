package org.gradle.test.performance15_4;

import static org.junit.Assert.*;

public class Test15_334 {
    private final Production15_334 production = new Production15_334("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}