package org.gradle.test.performance25_2;

import static org.junit.Assert.*;

public class Test25_163 {
    private final Production25_163 production = new Production25_163("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}