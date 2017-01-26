package org.gradle.test.performance25_3;

import static org.junit.Assert.*;

public class Test25_289 {
    private final Production25_289 production = new Production25_289("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}