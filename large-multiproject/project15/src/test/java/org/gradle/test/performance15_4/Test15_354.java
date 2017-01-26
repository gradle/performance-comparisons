package org.gradle.test.performance15_4;

import static org.junit.Assert.*;

public class Test15_354 {
    private final Production15_354 production = new Production15_354("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}