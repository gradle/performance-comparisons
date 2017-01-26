package org.gradle.test.performance15_5;

import static org.junit.Assert.*;

public class Test15_441 {
    private final Production15_441 production = new Production15_441("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}