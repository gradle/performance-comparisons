package org.gradle.test.performance15_4;

import static org.junit.Assert.*;

public class Test15_355 {
    private final Production15_355 production = new Production15_355("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}