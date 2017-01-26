package org.gradle.test.performance25_3;

import static org.junit.Assert.*;

public class Test25_213 {
    private final Production25_213 production = new Production25_213("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}