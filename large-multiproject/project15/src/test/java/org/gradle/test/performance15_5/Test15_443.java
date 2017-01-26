package org.gradle.test.performance15_5;

import static org.junit.Assert.*;

public class Test15_443 {
    private final Production15_443 production = new Production15_443("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}