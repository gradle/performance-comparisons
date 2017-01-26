package org.gradle.test.performance75_3;

import static org.junit.Assert.*;

public class Test75_241 {
    private final Production75_241 production = new Production75_241("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}