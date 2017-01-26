package org.gradle.test.performance75_1;

import static org.junit.Assert.*;

public class Test75_100 {
    private final Production75_100 production = new Production75_100("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}