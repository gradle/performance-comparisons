package org.gradle.test.performance15_5;

import static org.junit.Assert.*;

public class Test15_455 {
    private final Production15_455 production = new Production15_455("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}