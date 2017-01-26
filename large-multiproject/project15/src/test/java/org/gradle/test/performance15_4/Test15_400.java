package org.gradle.test.performance15_4;

import static org.junit.Assert.*;

public class Test15_400 {
    private final Production15_400 production = new Production15_400("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}