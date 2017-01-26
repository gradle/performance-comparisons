package org.gradle.test.performance25_4;

import static org.junit.Assert.*;

public class Test25_364 {
    private final Production25_364 production = new Production25_364("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}