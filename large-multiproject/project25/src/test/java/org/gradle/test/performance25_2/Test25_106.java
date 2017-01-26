package org.gradle.test.performance25_2;

import static org.junit.Assert.*;

public class Test25_106 {
    private final Production25_106 production = new Production25_106("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}