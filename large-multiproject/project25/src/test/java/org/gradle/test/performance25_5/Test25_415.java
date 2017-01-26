package org.gradle.test.performance25_5;

import static org.junit.Assert.*;

public class Test25_415 {
    private final Production25_415 production = new Production25_415("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}