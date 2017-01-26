package org.gradle.test.performance25_4;

import static org.junit.Assert.*;

public class Test25_373 {
    private final Production25_373 production = new Production25_373("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}