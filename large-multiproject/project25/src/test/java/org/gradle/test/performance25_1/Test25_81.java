package org.gradle.test.performance25_1;

import static org.junit.Assert.*;

public class Test25_81 {
    private final Production25_81 production = new Production25_81("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}