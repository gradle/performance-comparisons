package org.gradle.test.performance25_5;

import static org.junit.Assert.*;

public class Test25_435 {
    private final Production25_435 production = new Production25_435("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}