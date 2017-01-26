package org.gradle.test.performance25_5;

import static org.junit.Assert.*;

public class Test25_450 {
    private final Production25_450 production = new Production25_450("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}