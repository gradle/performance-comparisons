package org.gradle.test.performance25_5;

import static org.junit.Assert.*;

public class Test25_419 {
    private final Production25_419 production = new Production25_419("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}