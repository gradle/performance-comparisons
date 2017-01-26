package org.gradle.test.performance75_3;

import static org.junit.Assert.*;

public class Test75_289 {
    private final Production75_289 production = new Production75_289("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}