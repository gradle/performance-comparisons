package org.gradle.test.performance25_2;

import static org.junit.Assert.*;

public class Test25_109 {
    private final Production25_109 production = new Production25_109("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}