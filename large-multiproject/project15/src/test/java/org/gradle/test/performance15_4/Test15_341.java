package org.gradle.test.performance15_4;

import static org.junit.Assert.*;

public class Test15_341 {
    private final Production15_341 production = new Production15_341("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}