package org.gradle.test.performance84_4;

import static org.junit.Assert.*;

public class Test84_358 {
    private final Production84_358 production = new Production84_358("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}