package org.gradle.test.performance25_1;

import static org.junit.Assert.*;

public class Test25_60 {
    private final Production25_60 production = new Production25_60("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}