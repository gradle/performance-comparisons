package org.gradle.test.performance25_4;

import static org.junit.Assert.*;

public class Test25_360 {
    private final Production25_360 production = new Production25_360("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}