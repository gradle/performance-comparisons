package org.gradle.test.performance15_5;

import static org.junit.Assert.*;

public class Test15_499 {
    private final Production15_499 production = new Production15_499("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}