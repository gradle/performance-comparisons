package org.gradle.test.performance25_4;

import static org.junit.Assert.*;

public class Test25_358 {
    private final Production25_358 production = new Production25_358("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}