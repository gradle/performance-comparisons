package org.gradle.test.performance25_5;

import static org.junit.Assert.*;

public class Test25_471 {
    private final Production25_471 production = new Production25_471("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}