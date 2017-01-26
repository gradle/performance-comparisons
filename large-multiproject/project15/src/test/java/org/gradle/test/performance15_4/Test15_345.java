package org.gradle.test.performance15_4;

import static org.junit.Assert.*;

public class Test15_345 {
    private final Production15_345 production = new Production15_345("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}