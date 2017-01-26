package org.gradle.test.performance25_5;

import static org.junit.Assert.*;

public class Test25_422 {
    private final Production25_422 production = new Production25_422("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}