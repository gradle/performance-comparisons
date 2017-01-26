package org.gradle.test.performance75_4;

import static org.junit.Assert.*;

public class Test75_323 {
    private final Production75_323 production = new Production75_323("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}