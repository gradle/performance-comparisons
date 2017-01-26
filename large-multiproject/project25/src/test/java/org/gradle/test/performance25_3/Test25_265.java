package org.gradle.test.performance25_3;

import static org.junit.Assert.*;

public class Test25_265 {
    private final Production25_265 production = new Production25_265("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}