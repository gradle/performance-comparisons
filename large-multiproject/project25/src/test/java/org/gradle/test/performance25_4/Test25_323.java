package org.gradle.test.performance25_4;

import static org.junit.Assert.*;

public class Test25_323 {
    private final Production25_323 production = new Production25_323("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}