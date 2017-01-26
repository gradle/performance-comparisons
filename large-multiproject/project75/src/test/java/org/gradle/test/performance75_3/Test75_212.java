package org.gradle.test.performance75_3;

import static org.junit.Assert.*;

public class Test75_212 {
    private final Production75_212 production = new Production75_212("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}