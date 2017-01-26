package org.gradle.test.performance75_5;

import static org.junit.Assert.*;

public class Test75_500 {
    private final Production75_500 production = new Production75_500("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}