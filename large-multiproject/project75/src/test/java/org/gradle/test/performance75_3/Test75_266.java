package org.gradle.test.performance75_3;

import static org.junit.Assert.*;

public class Test75_266 {
    private final Production75_266 production = new Production75_266("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}