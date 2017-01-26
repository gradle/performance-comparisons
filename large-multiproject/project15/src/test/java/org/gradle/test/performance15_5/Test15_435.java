package org.gradle.test.performance15_5;

import static org.junit.Assert.*;

public class Test15_435 {
    private final Production15_435 production = new Production15_435("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}