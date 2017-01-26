package org.gradle.test.performance25_4;

import static org.junit.Assert.*;

public class Test25_361 {
    private final Production25_361 production = new Production25_361("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}