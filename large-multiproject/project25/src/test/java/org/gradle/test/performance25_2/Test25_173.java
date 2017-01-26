package org.gradle.test.performance25_2;

import static org.junit.Assert.*;

public class Test25_173 {
    private final Production25_173 production = new Production25_173("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}