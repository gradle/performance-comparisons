package org.gradle.test.performance15_1;

import static org.junit.Assert.*;

public class Test15_24 {
    private final Production15_24 production = new Production15_24("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}