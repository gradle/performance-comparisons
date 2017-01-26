package org.gradle.test.performance15_1;

import static org.junit.Assert.*;

public class Test15_20 {
    private final Production15_20 production = new Production15_20("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}