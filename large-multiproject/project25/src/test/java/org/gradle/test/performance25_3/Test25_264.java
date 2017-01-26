package org.gradle.test.performance25_3;

import static org.junit.Assert.*;

public class Test25_264 {
    private final Production25_264 production = new Production25_264("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}